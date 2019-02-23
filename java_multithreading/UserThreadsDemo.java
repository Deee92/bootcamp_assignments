/**
 * Question 1: Create and run a thread using Runnable interface and Thread class
 */

class ExtendedThread extends Thread {
    @Override
    public void run() {
        System.out.println("I'm a child thread extended from Thread: " + this.getName());
    }
}

class RunnableThread implements Runnable {
    @Override
    public void run() {
        System.out.println("I'm a child thread implementing Runnable: " + Thread.currentThread().getName());
    }
}

public class UserThreadsDemo {
    public static void main(String[] args) {
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        Thread childOne = new Thread(new RunnableThread());
        Thread childTwo = new ExtendedThread();
        childOne.start();
        childTwo.start();
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
