/**
 * Question 8: Implement multiple inheritance with default methods inside interface
 */

interface InterfaceOne {
    default void singSong() {
        System.out.println("InterfaceOne is singing a song!");
    }
}

interface InterfaceTwo {
    default void singSong() {
        System.out.println("InterfaceTwo is singing a song!");
    }
}

public class MultipleImplementationDemo implements InterfaceOne, InterfaceTwo {
    public void singSong() {
        InterfaceOne.super.singSong();
        // InterfaceTwo.super.singSong();
    }
    
    public static void main(String[] args) {
        MultipleImplementationDemo demo = new MultipleImplementationDemo();
        demo.singSong();
    }
}
