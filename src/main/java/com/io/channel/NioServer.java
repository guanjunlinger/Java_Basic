package com.io.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.util.Iterator;

public class NioServer {
    private Selector selector;

    public static void main(String[] args) throws IOException {
        NioServer server = new NioServer();
        server.initServer(8098);
        server.listener();
    }

    public void initServer(int port) throws IOException {
        ServerSocketChannel channel = ServerSocketChannel.open();
        channel.configureBlocking(false);
        channel.socket().bind(new InetSocketAddress(port));
        selector = Selector.open();
        channel.register(selector, SelectionKey.OP_ACCEPT);
    }

    public void listener() throws IOException {
        while (true) {
            selector.select();
            Iterator<SelectionKey> iterator = this.selector.selectedKeys().iterator();
            System.out.println("server size: " + this.selector.selectedKeys().size());
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                iterator.remove();
                if (key.isAcceptable()) {
                    accept(key);
                } else if (key.isReadable()) {
                    read(key);
                }
            }
        }
    }

    private void accept(SelectionKey key) {
        try {
            ServerSocketChannel server = (ServerSocketChannel) key.channel();
            SocketChannel channel = server.accept();
            channel.configureBlocking(false);
            channel.register(this.selector, SelectionKey.OP_READ);
        } catch (ClosedChannelException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void read(SelectionKey key) throws IOException {
        Charset charset = Charset.forName("utf-8");
        SocketChannel channel = (SocketChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        /**
         * 忽略读取不完全的情况
         * 忽略TCP粘包和分包问题
         */
        if (channel.read(buffer) < 0) {
            System.out.println("客户端断开连接");
            channel.close();
            return;
        }
        buffer.flip();
        String code = charset.decode(buffer).toString();
        System.out.println("服务器端接收:" + code);
        write(channel, code);
    }

    private void write(SocketChannel socketChannel, String code) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        buffer.put(code.getBytes());
        buffer.flip();
        while (buffer.hasRemaining()) {
            socketChannel.write(buffer);
        }

    }
}
