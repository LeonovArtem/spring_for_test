package com.example.demo.mentor.Module_2_3;

public class Lecture_2_3_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        printArrOne(arr);
        printArrTwo(1, 2, 3);
    }

    public static void printArrOne(int[] arr) {
        for (int el : arr) {
            System.out.println(el);
        }
    }

    public static void printArrTwo(int... arr) {
        for (int el : arr) {
            System.out.println(el);
        }
    }
}
