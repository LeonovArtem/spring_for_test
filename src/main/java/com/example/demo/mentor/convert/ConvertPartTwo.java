package com.example.demo.mentor.convert;

public class ConvertPartTwo {
    public static void main(String[] args) {
        byte a = 126;
        // Эквивалентно a = (byte) a + 3;
        a += 3;

        System.out.println(a);
    }

    public static void exampleOne() {
        double doubleValue = 1d + 1f; // приводит к double
        float floatValue = 1f * 1; // приводит к float
        long longValue = 1L - '0'; // приводит к long

        // Остальные приводит к int !!!
        byte a = 1;
        byte b = 2;
        byte c = (byte) (a + b); // Приведет к int!
    }
}
