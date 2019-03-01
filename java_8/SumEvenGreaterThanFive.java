/**
 * Question 10: Sum all the numbers greater than 5 in the integer list
 */

import java.util.Arrays;
import java.util.List;

public class SumEvenGreaterThanFive {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Sum of all even integers greater than 5: " +
                integers.stream()
                .filter(integer -> integer > 5)
                .filter(integer -> integer % 2 == 0)
                .reduce(0, (numOne, numTwo) -> numOne + numTwo));
    }
}
