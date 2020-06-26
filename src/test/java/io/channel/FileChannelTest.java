package io.channel;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

public class FileChannelTest {

    @Test
    public void testByteBuffer() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byte[] bytes = {1, 2};
        byteBuffer.put(bytes);
        byteBuffer.flip();
        while (byteBuffer.hasRemaining()) {
            System.out.println(byteBuffer.get());
        }

    }

    @Test
    public void testFileChannel() throws IOException {
        int max = 100;
        Charset charset= Charset.forName("utf-8");
        Path path = Paths.get(getClass().getResource("").getPath(), "guanjun.txt");
        Set<StandardOpenOption> set = new HashSet<>();
        set.add(StandardOpenOption.READ);
        set.add(StandardOpenOption.WRITE);
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        FileChannel fileChannel = FileChannel.open(path, set);
        String s = "";
        for (int i = 0; i < max; i++)
            s += 1;
        byteBuffer.put(charset.encode(s));
        byteBuffer.flip();
        System.out.println("写文件:" + fileChannel.write(byteBuffer));
        fileChannel.close();
        byteBuffer.clear();
        FileChannel fileChannelRead = FileChannel.open(path, set);
        ByteBuffer byteBufferReader = ByteBuffer.allocate(1024);
        fileChannelRead.read(byteBufferReader);
        byteBufferReader.flip();
        System.out.println(charset.decode(byteBufferReader).toString());
        fileChannel.close();


    }
}
