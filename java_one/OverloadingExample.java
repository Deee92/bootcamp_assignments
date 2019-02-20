/**
 * Question 10: A single program for the following operation using overloading
 * A) Add two integer numbers
 * B) Add two doubles
 * C) Multiply two floats
 * D) Multiply two ints
 * E) Concatenate two strings
 * F) Concatenate three strings
 */

public class OverloadingExample {
    int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    
    double add(double doubleOne, double doubleTwo) {
        return doubleOne + doubleTwo;
    }
    
    int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
    
    double multiply(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }
    
    String concatStrings(String stringOne, String stringTwo) {
        return (stringOne + " " + stringTwo);
    }
    
    String concatStrings(String stringOne, String stringTwo, String stringThree) {
        return (stringOne + " " + stringTwo + " " + stringThree);
    }
    
    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();
        System.out.println("Adding two integers: " + example.add(6, 2));
        System.out.println("Adding two doubles: " + example.add(6.6, 2.2));
        System.out.println("Multiplying two integers: " + example.multiply(6, 2));
        System.out.println("Multiplying two doubles: " + example.multiply(6.6, 2.2));
        System.out.println("Concatenating two strings: " + example.concatStrings("Hello", "world"));
        System.out.println("Concatenating three strings: " + example.concatStrings("Hello", "there", "world"));
        
    }
}
