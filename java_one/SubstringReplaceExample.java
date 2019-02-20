/**
 * Question 1: Program to replace a substring inside a string with another string
 */

public class SubstringReplaceExample {
    public static void main(String[] args) {
        String myString = "This is my string";
        System.out.println("Original String: " + myString);
        String newString = myString.replace("my", "our");
        System.out.println("Modified String: " + newString);
    }
}
