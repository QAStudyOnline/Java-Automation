package online.qastudy.lesson3.collections.theory;



import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;
import java.util.stream.Stream;

public class NullInCollections {

    public static void main(String[] args) {
        nullInLinkedList();
        nullInArrayList();
        nullInHashSet();
        nullInTreeSet();
        nullInMap();
        nullInConcurrentHashMap();
    }



    private static void nullInConcurrentHashMap() {
        System.out.println("Will be return Null pointer exception");
        Map<Object,Object> objectMap = new ConcurrentHashMap<>();
        Object key2 = null;
        Object value2 = "I am value2 from HashMap";

        Object key1 = "I am key1 from HashMap";
        Object value1 = null;

        objectMap.put(key1,value1);
        objectMap.put(key2,value2);

        Stream.of(objectMap).forEach(i-> System.out.println(i));

        System.out.println("If i call value by key, and key is null : ");
        System.out.println(objectMap.get(null));
    }

    private static void nullInArrayList() {
        List<Object> objectList = new ArrayList<>();
        Object ob1 = "I am ob1 from ArrayList";
        Object ob2 = null;
        objectList.add(ob1);
        objectList.add(ob2);
        objectList.add(null);
        objectList.stream().forEach(i-> System.out.println(i));
    }

    private static void nullInMap() {

        Map<Object,Object> objectMap = new HashMap<Object, Object>();
        Object key2 = null;
        Object value2 = "I am value2 from HashMap";

        Object key1 = "I am key1 from HashMap";
        Object value1 = null;

        objectMap.put(key1,value1);
        objectMap.put(key2,value2);

        Stream.of(objectMap).forEach(i-> System.out.println(i));

        System.out.println("If i call value by key, and key is null : ");
        System.out.println(objectMap.get(null));
    }

    private static void nullInHashSet() {
        Set<Object> objectSet1 = new HashSet<>();
        Object ob1 = "I am ob1 in HashSet";
        Object ob2 = "I am ob2 HashSet";
        objectSet1.add(ob1);
        objectSet1.add(ob2);
        objectSet1.add(null);
        objectSet1.stream().forEach(i-> System.out.println(i));
    }

    private static void nullInLinkedList() {
        List<Object> objectList = new LinkedList<>();
        Object ob1 = "I am ob1 from LinkedList";
        Object ob2 = null;
        objectList.add(ob1);
        objectList.add(ob2);
        objectList.add(null);

        objectList.stream().forEach(i-> System.out.println(i));
    }

    private static void nullInTreeSet(){
        System.out.println("Will return Null pointer exception");
        Set<Object> objectSet = new TreeSet<>();
        Object ob1 = "I am ob1 in TreeSet";
        Object ob2 = null;
        objectSet.add(ob1);
        objectSet.add(ob2);
        objectSet.add(null);
        objectSet.stream().forEach(i-> System.out.println(i));
    }
}
