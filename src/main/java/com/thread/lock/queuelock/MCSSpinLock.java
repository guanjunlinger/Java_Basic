package com.thread.lock.queuelock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class MCSSpinLock implements Lock {

    private static final AtomicReference<MCSNode> tail = new AtomicReference();
    private ThreadLocal<MCSNode> threadLocal = new ThreadLocal<>();

    @Override
    public void lock() {
        MCSNode currentThread = new MCSNode();
        threadLocal.set(currentThread);
        MCSNode predecessor = tail.getAndSet(currentThread);
        if (predecessor != null) {
            predecessor.next = currentThread;
            while (currentThread.isBlock) {
                //本地变量自旋
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
        MCSNode currentThread = threadLocal.get();
        if (currentThread == null) {
            throw new IllegalMonitorStateException("未获取锁线程无法释放锁");
        }

        if (currentThread.next == null) {
            if (tail.compareAndSet(currentThread, null)) {
                return;
            } else {

                while (currentThread.next == null) {
                    //等待后继者加入链表
                }
            }
        }
        threadLocal.remove();
        currentThread.next.isBlock = false;
        currentThread.next = null;
    }

    @Override
    public Condition newCondition() {
        return null;
    }

    public static class MCSNode {
        private volatile MCSNode next;
        private volatile boolean isBlock = true;
    }
}
