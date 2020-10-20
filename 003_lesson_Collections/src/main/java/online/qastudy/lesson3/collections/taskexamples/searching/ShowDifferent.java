package online.qastudy.lesson3.collections.taskexamples.searching;

import java.util.*;

public class ShowDifferent {
    public static <T> Collection<T> symmetricDifference(Collection<T> a, Collection<T> b) {

        Collection<T> intersection = new ArrayList<>(a);

        intersection.retainAll(b);
        Collection<T> result = new ArrayList<>(a);

        result.addAll(b);

        result.removeAll(intersection);

        return result;
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));
        List<String> b = new ArrayList<>(Arrays.asList("3", "4", "5", "6", "7"));

        Collection<String> c = symmetricDifference(a, b);

        System.out.println("Collection a: " + Arrays.toString(a.toArray())); // Collection a: [1, 2, 3, 4, 5]
        System.out.println("Collection b: " + Arrays.toString(b.toArray())); // Collection b: [3, 4, 5, 6, 7]
        System.out.println("Collection c: " + Arrays.toString(c.toArray())); // Collection c: [1, 2, 6, 7]
    }
}
