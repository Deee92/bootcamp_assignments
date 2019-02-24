/**
 * Question 3: Write a method that takes a string and print the number of
 * occurrences of each character in the string
 */

import java.util.*;

public class OccurrenceOfCharacter {
    void findOccurrenceOfCharacters(String myString) {
        System.out.println("Input string: " + myString);
        char[] stringAsArray = myString.toLowerCase().toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (char c : stringAsArray)
            characterList.add(c);
        Map<Character, Integer> characterFrequencyMap = new LinkedHashMap<>();
        for (Character c : characterList) {
            characterFrequencyMap.put(c, Collections.frequency(characterList, c));
        }
        for (Map.Entry m : characterFrequencyMap.entrySet()) {
            System.out.println(m.getKey() + " occurs " + m.getValue() + " time(s)");
        }
    }
    
    public static void main(String[] args) {
        OccurrenceOfCharacter occurrenceOfCharacter = new OccurrenceOfCharacter();
        String myString = "Java Collections Framework";
        occurrenceOfCharacter.findOccurrenceOfCharacters(myString);
    }
}
