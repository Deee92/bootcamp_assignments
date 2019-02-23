/**
 * Question 2: Use sleep and join methods with threads
 */

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(3000L);
            System.out.println("I'm a child thread extended from Thread: " + this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyRunnableThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000L);
            System.out.println("I'm a child thread implementing Runnable: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SleepJoinDemo {
    public static void main(String[] args) {
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        Thread childOne = new MyThread();
        Thread childTwo = new Thread(new MyRunnableThread());
        childOne.start();
        childTwo.start();
        try {
            childTwo.join();
            // childOne.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
