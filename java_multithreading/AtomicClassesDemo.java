/**
 * Question 12: Use Atomic classes instead of synchronized method and blocks
 */

import java.util.concurrent.atomic.AtomicInteger;

class YetAnotherClass {
    AtomicInteger counter = new AtomicInteger();
    
    void incrememnt() {
        counter.getAndIncrement();
    }
    
    void workerOne() {
        incrememnt();
    }
    
    void workerTwo() {
        incrememnt();
    }
}

public class AtomicClassesDemo {
    public static void main(String[] args) {
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        YetAnotherClass yetAnotherClass = new YetAnotherClass();
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1500; i++)
                    yetAnotherClass.workerOne();
            }
        });
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1500; i++)
                    yetAnotherClass.workerTwo();
            }
        });
        threadOne.start();
        threadTwo.start();
        try {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("AtomicInteger counter: " + yetAnotherClass.counter);
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
