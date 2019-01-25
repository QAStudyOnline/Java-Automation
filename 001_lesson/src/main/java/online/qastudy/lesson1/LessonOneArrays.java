package online.qastudy.lesson1;

import java.util.Arrays;

public class LessonOneArrays {
    public static void main(String[] args) {
//        int arrayLength = 5;
//        int[] ourFirstArray = new int[arrayLength];
//        int[] ourSecondArray = {1, 2, 3, 5, 6};
//        int[] ourThirdArray = new int[]{2, 3, 1, 22, 67};
//
//        System.out.println(ourFirstArray);
//
//        System.out.println("Length of array: " + ourThirdArray.length);
//
//        for (int i = 0; i < ourThirdArray.length; i++) {
//            System.out.println("Element of array with index " + i + " is :" + ourThirdArray[i]);
//        }

//        System.out.println(Arrays.toString(ourSecondArray));

        int[][] ourForthArray = new int[2][4];
        System.out.println(ourForthArray[0].length);
        ourForthArray[0] = new int[]{2, 3, 4, 5, 6};
        System.out.println(ourForthArray[0].length);

        System.out.println(ourForthArray[1].length);
        ourForthArray[1] = new int []{12, 13, 14, 15, 16};
        System.out.println(ourForthArray[1].length);

        for (int i = 0; i < ourForthArray.length; i++) {
            System.out.println("Array " + (i + 1) + ": ");
            for (int j = 0; j < ourForthArray[i].length; j++) {
                System.out.println(ourForthArray[i][j]);
            }
        }

        //
        int[] notSortedArray = new int[]{0, 2, 4, 67, 89, 2, 8, 0, 14, 51, 23};

        int tmp = 0;

        for (int i = 0; i < notSortedArray.length; i++) {
            for (int j = 1; j < notSortedArray.length - i; j++) {
                if (notSortedArray[j - 1] > notSortedArray[j]) {
                    tmp = notSortedArray[j - 1];
                    notSortedArray[j - 1] = notSortedArray[j];
                    notSortedArray[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(notSortedArray));
    }
}
