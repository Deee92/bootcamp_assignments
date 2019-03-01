/**
 * Question 9: Collect all the even numbers from an integer list
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectEvenIntegers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(
                integerList.parallelStream().
                        filter(integer -> integer % 2 == 0).
                        collect(Collectors.toList()));
    }
}
