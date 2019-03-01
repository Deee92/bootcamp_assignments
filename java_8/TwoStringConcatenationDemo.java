/**
 * Question 1.3: Concatenation of 2
 * Parameter (String, String) Return String
 */

@FunctionalInterface
interface TwoStringConcatenation {
    String concatTwoStrings(String stringOne, String stringTwo);
}

public class TwoStringConcatenationDemo {
    public static void main(String[] args) {
        TwoStringConcatenation twoStringConcatenation = (stringOne, stringTwo) -> stringOne.concat(stringTwo);
        
        System.out.println("Deepika concatenated with Tiwari: " + twoStringConcatenation.concatTwoStrings("Deepika", "Tiwari"));
    }
}
