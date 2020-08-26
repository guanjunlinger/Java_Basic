package language;

import org.testng.annotations.Test;

public class ThreadTest {
    @Test
    public void testInterrupt() {
        Runnable runnable = () -> {
            try {
                Thread.currentThread().sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("线程被中断");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        thread.interrupt();

    }

    @Test
    public void testStack() {
        Thread thread = Thread.currentThread();
        synchronized (thread) {
            System.out.println(Thread.holdsLock(thread));

        }
    }

    @Test
    public void testUncaughtExceptionHandler() {
        Thread thread1 = new Thread(() -> {
            throw new RuntimeException("1222");
        });
        thread1.setUncaughtExceptionHandler((thread, ex) ->
                System.out.println(thread.getName() + ":" + ex));
        thread1.start();

    }
}
