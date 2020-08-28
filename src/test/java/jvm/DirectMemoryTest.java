package jvm;

import org.testng.annotations.Test;

import java.nio.ByteBuffer;

public class DirectMemoryTest {

    /**
     * -XX:MaxDirectMemorySize=10M
     */
    @Test
    public void test() {
        ByteBuffer.allocateDirect(1024 * 1024 * 1024);
    }

}
