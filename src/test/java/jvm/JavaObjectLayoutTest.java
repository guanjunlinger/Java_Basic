package jvm;

import org.openjdk.jol.info.ClassLayout;
import org.testng.annotations.Test;


public class JavaObjectLayoutTest {
    /**
     * boolean  占用1个字节
     */
    @Test
    public void testBoolean() {
        System.out.println(ClassLayout.parseInstance(Boolean.TRUE).toPrintable());
    }

    /**
     * char占用两个字节
     */
    @Test
    public void testChar() {
        System.out.println(ClassLayout.parseInstance('1').toPrintable());
    }

    /**
     * -XX:+UseCompressedOops
     * JVM默认开启指针压缩,64位指针压缩为32位
     * 数组包括长度信息
     */
    @Test
    public void testArray() {
        int[] a = new int[1];
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
    }
}
