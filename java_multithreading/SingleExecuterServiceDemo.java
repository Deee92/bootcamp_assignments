/**
 * Question 3: Use a singleThreadExecutor to submit multiple threads
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleExecuterServiceDemo {
    public static void main(String[] args) {
        System.out.println("Main: " + Thread.currentThread().getName());
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000L);
                        System.out.println("Thread started: " + Thread.currentThread().getName());
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
                        System.out.println("Thread started: " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        } finally {
            executorService.shutdown();
        }
        System.out.println("isTerminated() : " + executorService.isTerminated());
        System.out.println("isShutdown() : " + executorService.isShutdown());
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
