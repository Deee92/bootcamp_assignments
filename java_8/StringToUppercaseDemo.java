/**
 * Question 1.4: Convert a string to uppercase and return it
 * Parameter String Return String
 */

@FunctionalInterface
interface StringToUppercase {
    String stringToUpper(String myString);
}

public class StringToUppercaseDemo {
    public static void main(String[] args) {
        StringToUppercase stringToUppercase = myString -> myString.toUpperCase();
        
        System.out.println("Deepika in uppercase: " + stringToUppercase.stringToUpper("Deepika"));
    }
}
