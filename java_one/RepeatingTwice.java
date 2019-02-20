/**
 *  Question 6: There is an array with every element repeated twice except one.
 *  Find that element.
 */
public class RepeatingTwice {
    
    static int findSingle(int array[], int arrayLength) {
        // Do XOR of all elements and return
        int result = array[0];
        for (int i = 1; i < arrayLength; i++)
            result = result ^ array[i];
        return result;
    }
    
    public static void main(String[] args) {
        int myArray[] = {2, 3, 5, 4, 5, 3, 4, 8, 10, 45, 2, 45, 10};
        int arrayLength = myArray.length;
        System.out.println("Element occurring once is " + findSingle(myArray, arrayLength));
    }
}