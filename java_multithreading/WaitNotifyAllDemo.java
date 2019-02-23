/**
 * Question 14: Coordinate multiple threads using wait() and notifyAll()
 */

class CoordinationTwo {
    void workerOne() {
        synchronized (this) {
            System.out.println("workerOne working");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("workerOne done");
        }
    }
    
    void workerTwo() {
        synchronized (this) {
            System.out.println("workerTwo working");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("workerTwo done");
        }
    }
    
    void workerThree() {
        synchronized (this) {
            System.out.println("workerThree working");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("workerThree done");
        }
    }
    
    void workerFour() {
        synchronized (this) {
            System.out.println("workerFour working");
            notifyAll();
            System.out.println("workerFour done");
        }
    }
}

public class WaitNotifyAllDemo {
    public static void main(String[] args) {
        System.out.println("Thread starting: " + Thread.currentThread().getName());
        CoordinationTwo coordinationTwo = new CoordinationTwo();
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                coordinationTwo.workerOne();
            }
        });
        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                coordinationTwo.workerTwo();
            }
        });
        Thread threadThree = new Thread(new Runnable() {
            @Override
            public void run() {
                coordinationTwo.workerThree();
            }
        });
        Thread threadFour = new Thread(new Runnable() {
            @Override
            public void run() {
                coordinationTwo.workerFour();
            }
        });
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        System.out.println("Thread exiting: " + Thread.currentThread().getName());
    }
}
