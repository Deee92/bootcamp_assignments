/**
 * Question 1.2: Increment the number by 1 and return the incremented value
 * Parameter (int) Return int
 */

@FunctionalInterface
interface IncrementByOne {
    int addOne(int number);
}

public class IncrementByOneDemo {
    public static void main(String[] args) {
        IncrementByOne incrementByOne = number -> number + 1;
        
        System.out.println("5 incremented by one: " + incrementByOne.addOne(5));
    }
}
