/**
 * Question 12: Find the first even number in an integer list which is greater than 3
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstEvenGreaterThanThree {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(3, 2, 6, 1, 8, 9, 10, 4);
        // List<Integer> integers = Arrays.asList(3, 2, 1);
        Optional<Integer> optionalInteger = integers.stream()
                .filter(integer -> integer > 3)
                .filter(integer -> integer % 2 == 0)
                .findFirst();
        if (optionalInteger.isPresent())
            System.out.println("First even integer greater than three: " + optionalInteger);
        else
            System.out.println("No even integers greater than three");
    }
}
