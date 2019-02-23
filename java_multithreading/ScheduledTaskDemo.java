/**
 * Question 8: Schedule task using schedule(), scheduleAtFixedRate(), and scheduleWithFixedDelay()
 */

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledTaskDemo {
    public static void main(String[] args) {
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        
        // schedule()
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1: " + Thread.currentThread().getName());
            }
        }, 2, TimeUnit.SECONDS);
        
        // scheduleAtFixedRate()
        ScheduledExecutorService scheduledExecutorService1 = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService1.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 (scheduled at fixed rate): " + Thread.currentThread().getName());
            }
        }, 1, 2, TimeUnit.SECONDS);
        
        // scheduleWithFixedDelay()
        ScheduledExecutorService scheduledExecutorService2 = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService2.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 3 (scheduled with fixed delay): " + Thread.currentThread().getName());
            }
        }, 3, 3, TimeUnit.SECONDS);
        
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
