package com.example.demo.mentor.Module_2_3;

import java.util.Arrays;

/**
 * Сравнение массивов
 */
public class Lecture_2_3_4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};


        // arr2 = arr1; - тогда равны

        // Сравнивает по ссылке
        boolean equals1 = (arr1 == arr2);
        boolean equals2 = arr1.equals(arr2);

        // Сравниваем по значению только для одномерных массивов
        boolean equals3 = Arrays.equals(arr1, arr2);

        int[][] arr3 = {{1, 2}, {3, 4}};
        int[][] arr4 = {{1, 2}, {3, 4}};
        boolean equals4 = Arrays.deepEquals(arr3, arr4);

        System.out.println("arr1 == arr2 : " + equals1);
        System.out.println("arr1.equals(arr2) : " + equals2);

        System.out.println("Arrays.equals(arr1, arr2) : " + equals3);
        System.out.println("Arrays.deepEquals(arr3, arr4) : " + equals4);
    }
}
