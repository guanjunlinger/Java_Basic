package thread.lock;

import org.testng.annotations.Test;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    @Test
    public void test() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(new MyTask(countDownLatch, i + 1)).start();
        }
        countDownLatch.await();
        System.out.println("Main Thread");

    }

    static class MyTask implements Runnable {
        private CountDownLatch countDownLatch;
        private int index;

        public MyTask(CountDownLatch countDownLatch, int index) {
            this.countDownLatch = countDownLatch;
            this.index = index;
        }

        @Override
        public void run() {
            System.out.println(index + ":到底指定位置");
            countDownLatch.countDown();
        }
    }


}
