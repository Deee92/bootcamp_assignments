/**
 *  Question 4: Program to create a singleton class
 */

class Singleton {
    private static Singleton singleInstance = null;
    String testString;
    
    private Singleton() {
        testString = "I am a singleton class";
    }
    
    static Singleton getInstance() {
        if (singleInstance == null)
            singleInstance = new Singleton();
        return singleInstance;
    }
}

public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("From s1: " + s1.testString);
        System.out.println("From s2: " + s2.testString);
        s1.testString = s1.testString.toUpperCase();
        System.out.println("From s1: " + s1.testString);
        System.out.println("From s2: " + s2.testString);
    }
}
