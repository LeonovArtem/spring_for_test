package com.example.demo.mentor.Module_2_3;

public class Arrays {
    public static void main(String[] args) {
        String[] str1 = {"1", "2"};
        // Лучше так не делать - нужно отделять имя переменно от типа
        String str2[] = {"1", "2"};

        initArrWithDefaultValue();
        //initArr();

        int[][] exampleArr = {
                {1, 2},
                null,
                {3, 4}
        };

    }

    public static void initArrWithDefaultValue() {
        int[] intArr = new int[3];
        char[] chars = new char[3];

        String[] str = new String[1];

        boolean[] bollVal = new boolean[2];
    }

    public static void initArr() {
        int[] arrInts = new int[]{9, 2, 5, 88};
        int latValue = arrInts[arrInts.length - 1];

        // Error - нет такого элемент
        System.out.println(arrInts[99]);
        System.out.println("Last value: " + latValue);
    }
}
