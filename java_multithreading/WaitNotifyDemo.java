/**
 * Question 13: Coordinate between two threads using wait() and notify()
 */

class Coordination {
    void workerOne() {
        synchronized (this) {
            System.out.println("workerOne working");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("workerOne done");
    }
    
    void workerTwo() {
        synchronized (this) {
            System.out.println("workerTwo working");
            notify();
        }
        System.out.println("workerTwo done");
    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) {
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        Coordination coordination = new Coordination();
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                coordination.workerOne();
            }
        });
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                coordination.workerTwo();
            }
        });
        threadOne.start();
        threadTwo.start();
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
