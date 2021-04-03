package com.example.demo.mentor.Module_2_3;

import java.util.Arrays;

/**
 * Распечатать массив
 */
public class Lecture_2_3_5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        int[][] deepArr = {{1, 2}, {3, 4, 5}};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(deepArr));
    }
}
