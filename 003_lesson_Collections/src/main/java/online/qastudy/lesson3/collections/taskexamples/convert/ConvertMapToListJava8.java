package online.qastudy.lesson3.collections.taskexamples.convert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToListJava8 {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");

        System.out.println("\n1. Export Map Key to List...");

        List<Integer> result = map.keySet().stream()
                .collect(Collectors.toList());

        result.forEach(System.out::println);

        System.out.println("\n2. Export Map Value to List...");

        List<String> result2 = map.values().stream()
                .collect(Collectors.toList());

        result2.forEach(System.out::println);

        System.out.println("\n3. Export Map Value to List..., say no to apple");
        List<String> result3 = map.values().stream()
                .filter(x -> !"apple".equalsIgnoreCase(x))
                .collect(Collectors.toList());

        result3.forEach(System.out::println);
    }
}
