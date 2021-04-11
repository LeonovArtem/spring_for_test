package com.example.demo.mentor.String;


import java.util.Arrays;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        int a = 5;

        System.out.println(charExpression(8));
        Integer.valueOf(1);
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 1E-4;
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
