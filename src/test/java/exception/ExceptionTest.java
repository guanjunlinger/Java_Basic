package exception;

import org.testng.annotations.Test;

public class ExceptionTest {

    @Test
    public void testReThrowsException() {
        try {
            division();
        } catch (Exception e) {
            throw e;
        }

    }

    /**
     * 保留原始异常链
     */
    @Test
    public void testWrapperException() {
        try {
            division();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * 重新定义异常抛出点
     */
    @Test
    public void testFillInStackTrace() {
        try {
            division();
        } catch (Exception e) {
            throw (RuntimeException) e.fillInStackTrace();
        }

    }


    public void division() {
        int a = 1 / 0;
        System.out.println(a);
    }

}
