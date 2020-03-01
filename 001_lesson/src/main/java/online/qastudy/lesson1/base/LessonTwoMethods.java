package online.qastudy.lesson1.base;

import online.qastudy.lesson1.oop.Wheels;

import java.util.Random;

public class LessonTwoMethods {
    public static final int AGE = 31; // создание констонт

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
        //  signature of the methods
    private int[] getRandomArray(int lenght) {
        Random rn = new Random();
        int[] result = new int[lenght];
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
        instance.printArray(instance.getRandomArray(30));

        System.out.println(Wheels.LEFT_WHEEL);
        System.out.println(Wheels.RIGHT_WHEEL);
    }
}
