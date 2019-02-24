/**
 * Question 2: Write a method that takes a string and returns the number
 * of unique characters in the string
 */

import java.util.HashSet;
import java.util.Set;

public class UniqueCharactersInString {
    int findNumberOfUniqueCharacter(String myString) {
        int numberOfUniqueCharacters;
        char[] stringAsArray = myString.toLowerCase().toCharArray();
        Set<Character> setOfCharacters = new HashSet<>();
        for (char c : stringAsArray) {
            setOfCharacters.add(c);
        }
        numberOfUniqueCharacters = setOfCharacters.size();
        return numberOfUniqueCharacters;
    }
    
    public static void main(String[] args) {
        UniqueCharactersInString uniqueCharactersInString = new UniqueCharactersInString();
        String[] myStrings = {"Deepika", "Kaaju", "Malviya Nagar", "To the New"};
        for (String s : myStrings) {
            System.out.println("Number of unique characters in " + s + ": "
                    + uniqueCharactersInString.findNumberOfUniqueCharacter(s));
        }
    }
}
