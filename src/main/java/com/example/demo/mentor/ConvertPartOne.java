package com.example.demo.mentor;

import java.lang.instrument.Instrumentation;

public class ConvertPartOne {
    private static Instrumentation instrumentation;

    public static void main(String[] args) {
        //printFirstExample();
        //printSecondExample();

        intToByte();
        lageFloatToInt();
        lageDoubleToFloat();
    }

    private static void doubleToInt() {
        double doubleVar = Math.PI; // 3.14
        int intPi = (int) doubleVar;

        System.out.println(intPi); // = 3 - Дробная часть отбрасывается
    }

    private static void intToByte() {

        int intVar = 257;
        byte byteVar = (byte) intVar; // старшие биты отбрасываются

        System.out.println(byteVar);
    }

    // Слишком большой float превращается в максимальный размер приводимого типа
    private static void lageFloatToInt() {
        float floatVar = 1e20f;
        int floatToInt = (int) floatVar;

        System.out.println(floatToInt);
    }

    // Слишком большой double превращается в бесконечность
    private static void lageDoubleToFloat() {
        double lageDouble = 1e100;
        float lageDoubleToFloat = (float) lageDouble;

        System.out.println(lageDoubleToFloat);
    }

    static void printSecondExample() {
        int intVar = 10;
        float floatVar = intVar;
        double doubleVar = intVar;

        System.out.println(doubleVar);
    }

    static void printFirstExample() {
        byte byteValue = 127;
        int intValue = (short) byteValue;

        char charValue = 'a';
        int charToInt = charValue;
        int charToLong = charValue;

        System.out.println(intValue);
        System.out.println(charToInt);
        System.out.println(charToLong);
    }
}
