package thread.lock;

import com.thread.lock.*;
import com.thread.lock.queuelock.CLHLock;
import com.thread.lock.queuelock.MCSSpinLock;
import com.thread.lock.queuelock.CLHTOLock;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LockTest {

    private int i = 0;
    private TASLock tasLock = new TASLock();
    private TTASLock ttasLock = new TTASLock();
    private BackoffLock backoffLock = new BackoffLock();
    private TicketFairSpinLock ticketLock = new TicketFairSpinLock();
    private ReentrantSpinLock reentrantSpinLock = new ReentrantSpinLock();
    private MCSSpinLock mcsSpinLock = new MCSSpinLock();
    private CLHLock clhLock = new CLHLock();
    private CLHTOLock toLock = new CLHTOLock();


    @AfterTest
    public void after() {

        System.out.println(i);
    }

    @Test(threadPoolSize = 10, invocationCount = 1000)
    public void testTASLock() {
        tasLock.lock();
        try {
            i++;
        } finally {
            tasLock.unlock();
        }

    }

    @Test(threadPoolSize = 10, invocationCount = 1000)
    public void testTTASLock() {
        ttasLock.lock();
        try {
            i++;
        } finally {
            ttasLock.unlock();
        }

    }

    @Test(threadPoolSize = 10, invocationCount = 1000)
    public void testBackoffLock() {
        backoffLock.lock();
        try {
            i++;
        } finally {
            backoffLock.unlock();
        }

    }

    @Test(threadPoolSize = 10, invocationCount = 1000)
    public void testTicketFairLock() {
        ticketLock.lock();
        try {
            i++;
        } finally {
            ticketLock.unlock();
        }

    }

    @Test(threadPoolSize = 10, invocationCount = 1000)
    public void testReentrantLock() {
        reentrantSpinLock.lock();
        try {
            i++;
        } finally {
            reentrantSpinLock.unlock();
        }


    }

    @Test(threadPoolSize = 10, invocationCount = 1000)
    public void testMCSSpinLock() {
        mcsSpinLock.lock();
        try {
            i++;
        } finally {
            mcsSpinLock.unlock();
        }

    }

    @Test(threadPoolSize = 10, invocationCount = 1000)
    public void testCLHLock() {
        clhLock.lock();
        try {
            i++;
        } finally {
            clhLock.unlock();
        }

    }

    @Test(threadPoolSize = 10, invocationCount = 1000)
    public void testTOLock() throws InterruptedException {
        if (toLock.tryLock(5, TimeUnit.MILLISECONDS)) {
            try {
                i++;
            } finally {
                toLock.unlock();
            }
        }
    }
}
