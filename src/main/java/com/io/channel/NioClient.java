package com.io.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class NioClient {
    private static Selector selector;
    private static volatile boolean stop = false;

    public static void main(String[] args) throws IOException {
        selector = Selector.open();
        SocketChannel channel = SocketChannel.open();
        channel.configureBlocking(false);
        channel.connect(new InetSocketAddress("localhost", 8098));
        channel.register(selector, SelectionKey.OP_CONNECT);

        while (!stop) {
            selector.select();
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                iterator.remove();
                if (key.isConnectable()) {
                    handleConnect(key);
                } else if (key.isReadable()) {
                    handleRead(key);
                }

            }
            if (stop) {
                break;
            }
        }
        selector.close();
    }

    private static void handleConnect(SelectionKey key) throws IOException {
        SocketChannel channel = (SocketChannel) key.channel();
        if (channel.isConnectionPending()) {
            channel.finishConnect();
        }

        channel.configureBlocking(false);

        channel.write(ByteBuffer.wrap("Hello Server!".getBytes()));

        channel.register(selector, SelectionKey.OP_READ);
        new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            CharBuffer charBuffer = CharBuffer.allocate(1024);
            while (!word.equalsIgnoreCase("quit")) {
                charBuffer.put(word);
                charBuffer.flip();
                try {
                    channel.write(ByteBuffer.wrap(charBuffer.toString().getBytes()));
                } catch (IOException e) {
                    e.printStackTrace();
                    stop = true;
                    break;
                }
                charBuffer.clear();
                word = scanner.nextLine();
            }
            stop = true;
            selector.wakeup();

        }).start();
    }


    private static void handleRead(SelectionKey key) throws IOException {
        SocketChannel channel = (SocketChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        /**
         * 忽略读取不完全的情况
         * 忽略TCP粘包和分包问题
         */
        if (channel.read(buffer) <= 0) {
            return;
        }
        byte[] data = buffer.array();
        String msg = new String(data).trim();
        System.out.println("client receive msg from server：" + msg);
    }

}
