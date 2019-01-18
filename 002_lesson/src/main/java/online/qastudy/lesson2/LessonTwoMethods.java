package online.qastudy.lesson2;

import java.util.Random;

public class LessonTwoMethods {
    public static final int AGE = 32; // создание констонт

    public static void printer(String forPrint) {
        System.out.println(forPrint);
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[ ");
            }
            System.out.print(i);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
            if (i == array.length - 1) {
                System.out.print(" ]");
            }
        }
    }

    private int[] getRandomArray() {
        Random rn = new Random();
        int[] result = new int[rn.nextInt(1000)];
        for (int i = 0; i < result.length; i++) {
            result[i] = rn.nextInt();
        }
        return result;
    }

    public static void main(String[] args) {
        printer(String.valueOf(AGE));

        LessonTwoMethods instance = new LessonTwoMethods();

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        instance.printArray(array);
        System.out.print("\n");
        instance.printArray(instance.getRandomArray());
    }
}
