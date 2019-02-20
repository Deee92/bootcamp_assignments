/**
 * Question 5: Common elements between two arrays
 */

import java.util.ArrayList;

public class CommonElementsInArray {
    public static void main(String[] args) {
        int arrayOne[] = {1, 2, 3, 4, 5};
        int arrayTwo[] = {5, 6, 7, 1};
        ArrayList<Integer> commonElements = new ArrayList<>();
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    commonElements.add(arrayOne[i]);
                }
            }
        }
        System.out.println("Elements common to both: " + commonElements);
    }
}
