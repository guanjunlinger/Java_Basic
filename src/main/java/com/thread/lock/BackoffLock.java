package com.thread.lock;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class BackoffLock implements Lock {
    private AtomicBoolean state = new AtomicBoolean(false);
    private static final int MIN_DELAY = 1;
    private static final int MAX_DELAY = 16;


    @Override
    public void lock() {
        while (true) {
            while (state.get()) {
            }
            if (!state.getAndSet(true)) {
                return;
            }
            Backoff backoff = new Backoff(1, 16);
            try {
                backoff.backoff();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void lockInterruptibly() {
        lock();
    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) {
        return false;
    }

    @Override
    public void unlock() {
        if (!state.getAndSet(false)) {
            throw new IllegalMonitorStateException("未获取锁线程无法释放锁");
        }
    }

    @Override
    public Condition newCondition() {
        return null;
    }

    private static class Backoff {


        private final int minDelay, maxDelay;
        private int limit;
        private final Random random;

        public Backoff(int min, int max) {
            minDelay = min;
            maxDelay = max;
            limit = minDelay;
            random = new Random();
        }

        public void backoff() throws InterruptedException {
            int delay = random.nextInt(limit);
            limit = Math.min(maxDelay, 2 * limit);
            Thread.sleep(delay);
        }
    }
}
