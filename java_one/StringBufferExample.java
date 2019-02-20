/**
 * Question 8: Program to reverse a string and remove character from
 * index 4 to index 9 from the reversed string using StringBuffer
 */

public class StringBufferExample {
    public static void main(String[] args) {
        String myString = "Strings are fun";
        System.out.println("Original String: " + myString);
        char[] charFromString = myString.toCharArray();
        StringBuffer myStringBuffer = new StringBuffer();
        for (int i = charFromString.length - 1; i >= 0; i--) {
            myStringBuffer.append(charFromString[i]);
        }
        System.out.println("Reversed StringBuffer object: " + myStringBuffer);
        myStringBuffer.delete(4, 10);
        System.out.println("Modified StringBuffer object: " + myStringBuffer);
    }
}
