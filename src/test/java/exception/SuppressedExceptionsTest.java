package exception;

import org.testng.annotations.Test;

public class SuppressedExceptionsTest {

    public static class Resource implements AutoCloseable {
        public void use() {
            throw new RuntimeException("This exception in the use method");
        }

        @Override
        public void close() {
            throw new NullPointerException("This exception in the close method");
        }
    }

    /**
     * finally 抛异常导致原始异常丢失
     */
    @Test
    public void test() {
        try {
            throwsException();
        } catch (Exception ex) {
            ex.printStackTrace();
            final Throwable[] suppressedExceptions = ex.getSuppressed();
            final int numSuppressed = suppressedExceptions.length;
            if (numSuppressed > 0) {
                System.err.println("There are " + numSuppressed
                        + " suppressed exceptions:");
                for (final Throwable exception : suppressedExceptions) {
                    System.err.println("tt" + exception.toString());
                }
            }
        }
    }

    /**
     * 保留最先抛出的异常信息
     */
    @Test
    public void testSuppressedException() {
        try {
            throwsSuppressedException();
        } catch (Exception ex) {
            ex.printStackTrace();
            final Throwable[] suppressedExceptions = ex.getSuppressed();
            final int numSuppressed = suppressedExceptions.length;
            if (numSuppressed > 0) {
                System.err.println("There are " + numSuppressed
                        + " suppressed exceptions:");
                for (final Throwable exception : suppressedExceptions) {
                    System.err.println(exception.toString());
                }
            }
        }
    }

    /**
     * 语法糖,JDK 1.7新特性
     */
    @Test
    public void testTryWithResource() {
        try (Resource resource = new Resource()) {
            resource.use();
        }
    }

    public void throwsException() {
        Resource resource = new Resource();
        try {
            resource.use();
        } finally {
            resource.close();
        }
    }

    public void throwsSuppressedException() {
        Throwable throwable = null;
        Resource resource = new Resource();
        try {
            resource.use();
        } catch (Exception e) {
            throwable = e;
        } finally {
            try {
                resource.close();
            } catch (Exception e) {
                if (throwable != null) {
                    e.addSuppressed(throwable);
                }
                throw e;
            }
        }
    }

}

