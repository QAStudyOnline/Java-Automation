package online.qastudy.lesson2.oop.spares;

import java.util.Arrays;

public class UnitS {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        // Вызываем метод для сортировки массива по возрастанию с использованием Bubble Sort
        bubbleSort(arr);

        // Выводим отсортированный массив
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Обмен элементов, если они стоят в неправильном порядке
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}