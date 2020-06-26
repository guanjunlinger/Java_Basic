package com.thread.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class TicketFairSpinLock implements Lock {

    private AtomicInteger serviceNum = new AtomicInteger(0);
    private AtomicInteger ticketNum = new AtomicInteger(0);
    private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    @Override
    public void lock() {
        Integer myTicketNum = ticketNum.getAndIncrement();
        threadLocal.set(myTicketNum);
        while (serviceNum.get() != myTicketNum) {
        }

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        lock();
    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        Integer ticket = threadLocal.get();
        if (ticket == null) {
            throw new IllegalMonitorStateException("未获取锁线程无法释放锁");
        }
        threadLocal.remove();
        serviceNum.compareAndSet(ticket, ticket + 1);
    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
