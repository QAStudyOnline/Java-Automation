package online.qastudy.lesson2.oop.spares;

import java.util.Random;

public class UnitO {
    public static void main(String[] args) {
        // Создаем массив из 15 случайных целых чисел от 0 до 9
        int[] numbers = new int[15];
        Random random = new Random();
        // Генерируем случайное число от 0 до 9
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }
        // Выводим массив на экран
        System.out.print("Массив: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // Переходим на новую строку

        // Подсчитываем количество четных элементов
        int Count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                Count++;
            }
        }

        // Выводим количество четных элементов на экран
        System.out.println("Количество четных элементов: " + Count);
    }
}