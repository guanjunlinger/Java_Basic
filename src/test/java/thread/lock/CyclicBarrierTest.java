package thread.lock;

import lombok.Data;
import org.testng.annotations.Test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CyclicBarrierTest {

    @Test
    public void testNormal() {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, () ->
                System.out.println("足球比赛正式开始"));
        for (int i = 0; i < 5; i++) {
            new Thread(new MyTask(cyclicBarrier, i + 1)).start();
        }
    }

    /**
     * 超时逻辑:
     * 超时线程会抛出TimeoutException
     * 其他阻塞线程被唤醒,然后抛出BrokenBarrierException
     * @throws InterruptedException
     */
    @Test
    public void testTimeout() throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () ->
                System.out.println("足球比赛正式开始"));
        Thread[] threads = new Thread[4];
        for (int i = 0; i < 4; i++) {
            threads[i] = new Thread(new MyTask(cyclicBarrier, i + 1));
            threads[i].start();
        }
        for (int i = 0; i < 4; i++) {
            threads[i].join();
        }
    }

    @Data
    static class MyTask implements Runnable {
        private CyclicBarrier cyclicBarrier;
        private Integer index;

        public MyTask(CyclicBarrier cyclicBarrier, Integer index) {
            this.cyclicBarrier = cyclicBarrier;
            this.index = index;
        }

        @Override
        public void run() {
            System.out.println("Thread:" + index + "准备就绪");
            try {
                cyclicBarrier.await(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }
    }
}
