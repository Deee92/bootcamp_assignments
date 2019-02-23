/**
 * Question 9: Increase concurrency with Thread pools using newCachedThreadPool()
 * and newFixedThreadPool()
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        ExecutorService executorServiceOnFixedPool = Executors.newFixedThreadPool(4);
        try {
            executorServiceOnFixedPool.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000L);
                        System.out.println("Fixed-pool thread: " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            executorServiceOnFixedPool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Fixed-pool thread: " + Thread.currentThread().getName());
                }
            });
            executorServiceOnFixedPool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Fixed-pool thread: " + Thread.currentThread().getName());
                }
            });
            executorServiceOnFixedPool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Fixed-pool thread: " + Thread.currentThread().getName());
                }
            });
        } finally {
            executorServiceOnFixedPool.shutdown();
        }
        executorServiceOnFixedPool.awaitTermination(1000L, TimeUnit.SECONDS);
        
        ExecutorService executorServiceOnCachedPool = Executors.newCachedThreadPool();
        try {
            for (int i = 1; i <= 50; i++) {
                executorServiceOnCachedPool.submit(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("Cached-thread pool: " + Thread.currentThread().getName());
                    }
                });
            }
        } finally {
            executorServiceOnCachedPool.shutdown();
        }
        // executorServiceOnCachedPool.awaitTermination(5000L, TimeUnit.SECONDS);
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
