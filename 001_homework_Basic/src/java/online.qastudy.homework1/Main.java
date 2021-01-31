package online.qastudy.homework1;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void print(String forPrint) {
        System.out.println(forPrint);
    }

    public static void print(int forPrint) {
        System.out.println(forPrint);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[ ");
            }
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
            if (i == array.length - 1) {
                System.out.print(" ]");
            }
        }
        System.out.print("\n");
    }

    public static int[] getRandomArray(int length) {
        int[] array = new int[length];
        Random random = new Random(0);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9);
        }
        printArray(array);
        return array;
    }

    public static int countEvenItems(int[] array) {
        int countItems = 0;
        for(int i = 0; i < array.length; i++) {
            boolean isEven = array[i] % 2 == 0;
            if (isEven) {
                countItems++;
            }
        }
        print(countItems);
        return countItems;
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
        printArray(array);
    }


    public static void main(String[] args) {
        print("Homework 1");
        int[] randomArr = getRandomArray(5);
        countEvenItems(randomArr);
        sortArray(randomArr);
    }
}

