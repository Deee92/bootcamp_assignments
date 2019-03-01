/**
 * Question 6: Create and access default and static methods of an interface
 */

// @FunctionalInterface
interface InterfaceForDisplaying {
    default void displayDefault() {
        System.out.println("I'm a default method defined in an interface");
    }
    
    static void displayStatic() {
        System.out.println("I'm a static method defined in an interface");
    }
    
    void displayAbstract();
}

public class InterfaceMethodDemo implements InterfaceForDisplaying {
    @Override
    public void displayAbstract() {
        System.out.println("I'm an abstract method defined in an implementing class");
    }
    
    public static void main(String[] args) {
        InterfaceMethodDemo demo = new InterfaceMethodDemo();
        // System.out.println("Calling default method of interface from class");
        demo.displayDefault();
        InterfaceForDisplaying.displayStatic();
        demo.displayAbstract();
    }
}
