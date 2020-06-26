package com.thread.lock.queuelock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class CLHTOLock implements Lock {
    private final static QNode AVAILABLE = new QNode();
    private static final AtomicReference<QNode> tail = new AtomicReference();
    private ThreadLocal<QNode> threadLocal = new ThreadLocal<>();


    @Override
    public void lock() {

    }

    @Override
    public void lockInterruptibly() {
        lock();
    }

    @Override
    public boolean tryLock() {
        return tryLock(0, TimeUnit.MILLISECONDS);

    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) {
        long startTime = System.currentTimeMillis();
        long patience = TimeUnit.MILLISECONDS.convert(time, unit);
        QNode qnode = new QNode();
        threadLocal.set(qnode);
        QNode myPred = tail.getAndSet(qnode);
        if (myPred == null || myPred.pred == AVAILABLE) {
            return true;
        }
        while (System.currentTimeMillis() - startTime < patience) {
            QNode predPred = myPred.pred;
            if (predPred == AVAILABLE) {
                return true;
            } else if (predPred != null) {
                myPred = predPred;
            }
        }
        if (!tail.compareAndSet(qnode, myPred)) {
            qnode.pred = myPred;
        }
        return false;
    }

    @Override
    public void unlock() {
        QNode currentThread = threadLocal.get();
        if (currentThread == null) {
            throw new IllegalMonitorStateException("未获取锁线程无法释放锁");
        }
        if (!tail.compareAndSet(currentThread, null)) {
            currentThread.pred = AVAILABLE;
        }
        threadLocal.remove();

    }

    @Override
    public Condition newCondition() {
        return null;
    }

    static class QNode {
        public QNode pred = null;
        /**
         * null:当前节点等待获得锁
         * AVAILABLE:当前节点已经释放锁
         * QNode实例:前驱节点
         */
    }
}
