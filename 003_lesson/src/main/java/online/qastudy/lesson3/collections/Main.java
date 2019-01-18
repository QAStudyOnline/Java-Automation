package online.qastudy.lesson3.collections;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Item> arrayItemList = new ArrayList<Item>();
        for (int i = 0; i < 5; i++) {
            arrayItemList.add(new Item("Name", new BigDecimal(2.32)));
        }
        System.out.println("Array List");
        System.out.println(arrayItemList.toString());

        Set<Item> itemSet = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            itemSet.add(new Item("ItemName", new BigDecimal(2.32)));
        }
        System.out.println("Set");
        System.out.println(itemSet.toString());
    }
}