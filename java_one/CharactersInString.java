/**
 * Question 4: Program to calculate the number and percentage of lowercase letters,
 * uppercase letters, digits, and other special characters in a string
 */

public class CharactersInString {
    public static void main(String[] args) {
        
        String inputString = "My E-Mail ID is deepika.tiwari.01@ttn.com!";
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        int specialCharacterCount = 0;
        for (int k = 0; k < inputString.length(); k++) {
            // Check for uppercase letters
            if (Character.isUpperCase(inputString.charAt(k))) upperCaseCount++;
            
            // Check for lowercase letters
            if (Character.isLowerCase(inputString.charAt(k))) lowerCaseCount++;
            
            // Check for digits
            if (Character.isDigit(inputString.charAt(k))) digitCount++;
            
            // Check for special characters, including spaces
            if (!(Character.isDigit(inputString.charAt(k))) && !(Character.isAlphabetic(inputString.charAt(k))))
                specialCharacterCount++;
            
        }
        System.out.println("Input string: " + inputString);
        
        System.out.println("Uppercase-letter count: " + upperCaseCount);
        System.out.println("Uppercase-letter percentage: " + (((float) upperCaseCount / inputString.length()) * 100) + "%");
        
        System.out.println("Lowercase-letter count: " + lowerCaseCount);
        System.out.println("Lowercase-letter percentage: " + (((float) lowerCaseCount / inputString.length()) * 100) + "%");
        
        System.out.println("Digit count: " + digitCount);
        System.out.println("Digit percentage: " + (((float) digitCount / inputString.length()) * 100) + "%");
        
        System.out.println("Special-character count: " + specialCharacterCount);
        System.out.println("Special-character percentage: " + (((float) specialCharacterCount / inputString.length()) * 100) + "%");
    }
}
