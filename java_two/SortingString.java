/**
 * Question 2: Program to sort string without using string methods
 */

public class SortingString {
    public static void main(String[] args) {
        String str = "determination";
        char charArray[] = new char[str.length()];
        str = str.toLowerCase();
        int index = 0;
        
        for (int i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == i) {
                    charArray[index++] = (char) i;
                }
            }
        }
        
        System.out.println(charArray);
    }
    
}
