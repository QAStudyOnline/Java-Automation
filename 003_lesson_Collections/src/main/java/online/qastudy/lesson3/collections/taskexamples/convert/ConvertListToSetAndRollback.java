package online.qastudy.lesson3.collections.taskexamples.convert;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSetAndRollback {
    public static void main(String[] args) {
        hashSetToArrayListInOneRow();
        arrayListToHashSetInOneRow();
    }

    private static void arrayListToHashSetInOneRow() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        System.out.println("My ArrayList is : ");
        list.stream().forEach(i-> System.out.println(i));

        Set<String> set = new HashSet<>(list);
        System.out.println("My HashSet is : ");
        set.stream().forEach(i-> System.out.println(i));
    }

    private static void hashSetToArrayListInOneRow() {
        Set<String> set = new HashSet<>();

        set.add("A");
        set.add("B");

        System.out.println("My HashSet is : ");
        set.stream().forEach(i-> System.out.println(i));

        List<String> list = new ArrayList<>(set);

        System.out.println("My ArrayList is : ");
        list.stream().forEach(i-> System.out.println(i));

    }
}
