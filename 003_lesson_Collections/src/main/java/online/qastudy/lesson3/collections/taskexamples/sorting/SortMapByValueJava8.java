package online.qastudy.lesson3.collections.taskexamples.sorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValueJava8 {
    public static void main(String[] argv) {

        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("z", 10);
        unsortedMap.put("b", 5);
        unsortedMap.put("a", 6);
        unsortedMap.put("c", 20);
        unsortedMap.put("d", 1);
        unsortedMap.put("e", 7);
        unsortedMap.put("y", 8);
        unsortedMap.put("n", 89);
        unsortedMap.put("g", 50);
        unsortedMap.put("m", 2);
        unsortedMap.put("f", 9);

        System.out.println("Before : ");
        System.out.println(unsortedMap);


        Map<String, Integer> result = unsortedMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));



        Map<String, Integer> result2 = new LinkedHashMap<>();
        unsortedMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));

        System.out.println("After : ");
        System.out.println(result);
        System.out.println(result2);

    }
}
