/**
 *  Question 2: Program to find the number of occurrences of duplicate words
 *  in a string and print them
 */

public class DuplicateInString {
    public static void main(String[] args) {
        String myString = "Because the world is a place of silence the sky at night when the birds have gone is a vast silent place";
        int wordCount;
        
        String wordsInString[] = myString.split(" ");
    
        System.out.println("word: count");
        System.out.println("-----------");
        for (int i = 0; i < wordsInString.length; i++) {
            wordCount = 1;
            for (int j = i + 1; j < wordsInString.length; j++) {
                if (wordsInString[i].equalsIgnoreCase(wordsInString[j])) {
                    wordCount++;
                    //Set words[j] to empty to avoid printing visited word
                    wordsInString[j] = "";
                }
            }
            
            //Displays the duplicate word if count is greater than 1
            if (wordCount > 1 && wordsInString[i] != "")
                System.out.println(wordsInString[i] + ": " + wordCount);
        }
    }
}