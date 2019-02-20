/**
 * Question 3: Program to find the number of occurrences of a character
 * in a string without using loop
 */
public class CharacterOccurrenceExample {
    public static void main(String[] args) {
        String str = "Deepika";
        int len = str.length();
        String replaced_str = str.replaceAll("e", "");
        int replaced_length = replaced_str.length();
        int difference = len - replaced_length;
        System.out.println("Number of times 'e' occurred  is " + difference);
    }
}
