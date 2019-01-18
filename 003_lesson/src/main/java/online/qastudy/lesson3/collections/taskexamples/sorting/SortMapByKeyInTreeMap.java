package online.qastudy.lesson3.collections.taskexamples.sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKeyInTreeMap {
    public static void main(String[] args) {

        Map<String, String> unsortedMap = new HashMap<String, String>();
        unsortedMap.put("Z", "z");
        unsortedMap.put("B", "b");
        unsortedMap.put("A", "a");
        unsortedMap.put("C", "c");
        unsortedMap.put("D", "d");
        unsortedMap.put("E", "e");
        unsortedMap.put("Y", "y");
        unsortedMap.put("N", "n");
        unsortedMap.put("J", "j");
        unsortedMap.put("M", "m");
        unsortedMap.put("F", "f");

        System.out.println("Unsorted Map......");
        printMap(unsortedMap);

        System.out.println("\nSorted Map......By Key");
        Map<String, String> treeMap = new TreeMap<String, String>(unsortedMap);
        printMap(treeMap);

    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }
}
