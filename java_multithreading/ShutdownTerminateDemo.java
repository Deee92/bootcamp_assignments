/**
 * Question 5: Use isShutDown() and isTerminated() with ExecutorService
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownTerminateDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000L);
                        System.out.println("Thread 1");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000L);
                        System.out.println("Thread 2");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        } finally {
            executorService.shutdown();
        }
        System.out.println("isTerminated(): " + executorService.isTerminated());
        System.out.println("isShutdown(): " + executorService.isShutdown());
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
