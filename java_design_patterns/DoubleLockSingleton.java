/**
 * Question 1: Implement the Singleton design pattern on a dummy class
 */

class DoubleLockSingleton {
    private static DoubleLockSingleton instance;
    
    public static DoubleLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }
    
    public static void main(String[] args) {
        DoubleLockSingleton instance1 = DoubleLockSingleton.getInstance();
        DoubleLockSingleton instance2 = DoubleLockSingleton.getInstance();
        System.out.println("Hash code of first instance: " + instance1.hashCode());
        System.out.println("Hash code of second instance: " + instance2.hashCode());
        // System.out.println(instance1 == instance2);
        // System.out.println(instance1.equals(instance2));
    }
}
