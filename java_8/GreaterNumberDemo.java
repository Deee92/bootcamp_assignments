/**
 * Question 1.1: First number is greater than second number or not
 * Parameter (int, int) Return boolean
 */

@FunctionalInterface
interface GreaterNumber {
    boolean isFirstNumberGreater(int firstNumber, int secondNumber);
}

public class GreaterNumberDemo {
    public static void main(String[] args) {
        GreaterNumber greaterNumber = (firstNumber, secondNumber) -> {
            if (firstNumber > secondNumber)
                return true;
            else return false;
        };
        
        System.out.println("3 > 4 : " + greaterNumber.isFirstNumberGreater(3, 4));
        System.out.println("4 > 3 : " + greaterNumber.isFirstNumberGreater(4, 3));
    }
}
