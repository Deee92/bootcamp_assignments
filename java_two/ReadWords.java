/**
 * Question 8: Program to read words from the keyboard until the word done is entered.
 * For each word except done, report whether its first character is equal to its last
 * character. For the required loop, use a
 * a)while statement
 * b)do-while statement
 */

import java.util.Scanner;

public class ReadWords {
    public static void main(String[] args) {
        System.out.println("Reading using while");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = keyboard.next();
        while (!word.equals("done")) {
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equals for the word: " + word);
            } else {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            
            System.out.println("\nEnter a word");
            word = keyboard.next();
        }
        
        
        System.out.println("\ndone is encountered\n");
        System.out.println("reading using do-while\n");
        
        
        System.out.println("Enter a word");
        word = keyboard.next();
        do {
            if (word.equals("done")) {
                continue;
            }
            
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equals for the word: " + word);
            } else {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            
            
            System.out.println("\nEnter a word");
            word = keyboard.next();
        } while (!word.equals("done"));
        
        System.out.println("\ndone is encountered\n");
        
        
    }
    
}
