package com.thread.lock.queuelock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class CLHLock implements Lock {
    private static final AtomicReference<CLHNode> tail = new AtomicReference<>();
    private ThreadLocal<CLHNode> threadLocal = new ThreadLocal<>();

    @Override
    public void lock() {
        CLHNode currentThread = new CLHNode();
        threadLocal.set(currentThread);
        CLHNode preNode = tail.getAndSet(currentThread);
        if (preNode != null) {
            while (preNode.isBlock) {
                //前驱节点自旋
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
        CLHNode currentThread = threadLocal.get();
        if (currentThread == null) {
            throw new IllegalMonitorStateException("未获取锁线程无法释放锁");
        }
        if (!tail.compareAndSet(currentThread, null)) {
            currentThread.isBlock = false;
        }
        threadLocal.remove();

    }

    @Override
    public Condition newCondition() {
        return null;
    }

    public static class CLHNode {
        private volatile boolean isBlock = true;
    }
}
