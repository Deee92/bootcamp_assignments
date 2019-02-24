/**
 * Question 6: Print the elements of an array in the order of decreasing frequency
 * If two numbers have the same frequency then print the one which came first
 */

import java.util.*;

class ElementFrequencyMap {
    Map<Integer, Integer> elementFrequencyMap = new LinkedHashMap<>();
    
    void generateElementFrequencyMap(List<Integer> integers) {
        for (Integer i : integers)
            elementFrequencyMap.put(i, Collections.frequency(integers, i));
        
        Set<Map.Entry<Integer, Integer>> set = elementFrequencyMap.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(set);
        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        
        for (Map.Entry entry : list) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time(s)");
        }
    }
}

public class ArrayFrequencyDemo {
    public static void main(String[] args) {
        ElementFrequencyMap elementFrequencyMap = new ElementFrequencyMap();
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(5);
        integerList.add(6);
        integerList.add(5);
        integerList.add(9);
        integerList.add(7);
        integerList.add(8);
        integerList.add(10);
        integerList.add(9);
        elementFrequencyMap.generateElementFrequencyMap(integerList);
    }
}
