/**
 * Question 4: Try shutdown() and shutdownNow() and observe the difference
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1 starting: " + Thread.currentThread().getName());
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2 starting: " + Thread.currentThread().getName());
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000L);
                        System.out.println("Thread 3 starting: " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        // e.printStackTrace();
                    }
                }
            });
        } finally {
            // executorService.shutdown();
            executorService.shutdownNow();
        }
        System.out.println("isTerminated() : " + executorService.isTerminated());
        System.out.println("isShutdown() : " + executorService.isShutdown());
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
