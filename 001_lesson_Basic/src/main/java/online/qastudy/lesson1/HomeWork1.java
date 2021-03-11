package online.qastudy.lesson1;

import java.util.Arrays;
import java.util.Random;

public class HomeWork1 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int count = 0;
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(9); }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++; }
        }
        System.out.println(count);

        Arrays.sort(array);
        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}