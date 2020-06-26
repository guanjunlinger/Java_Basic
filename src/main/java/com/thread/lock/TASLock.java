package com.thread.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;


public class TASLock implements Lock {
    private AtomicBoolean state = new AtomicBoolean(false);


    @Override
    public void lock() {
        while (state.getAndSet(true)) {

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
}
