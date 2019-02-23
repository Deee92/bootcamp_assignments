/**
 * Question 15: Use ReentrantLock to coordinate two threads with signal(),
 * signalAll(), and wait()
 */

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AwaitSignalDemo {
    
    Lock lock = new ReentrantLock(true);
    Condition condition = lock.newCondition();
    
    public void workerOne() {
        try {
            lock.lock();
            System.out.println("workerOne working");
            condition.await();
            System.out.println("workerOne done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    
    public void workerTwo() {
        try {
            lock.lock();
            System.out.println("workerTwo working");
            condition.signal();
            System.out.println("workerTwo done");
        } finally {
            lock.unlock();
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        AwaitSignalDemo awaitSignalDemo = new AwaitSignalDemo();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                awaitSignalDemo.workerOne();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                awaitSignalDemo.workerTwo();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
