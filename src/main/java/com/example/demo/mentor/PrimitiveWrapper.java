package com.example.demo.mentor;

public class PrimitiveWrapper {
    // Классы обертки нужны для упаковки в коллекции или для хранения пустых значений
    // Операции над классмами обертками на порядок медленее
    public static void main(String[] args) {
        int intVal = 300;
        // boxing
        Integer refInt = Integer.valueOf(intVal);

        // unboxing
        System.out.println(refInt.byteValue());

        covertToString();
        usefulMethod();
    }


    public static void covertToString() {
        // Строку в примитив только явно
        long fromString = Long.parseLong("12345");

        String fromLong = Long.toString(12345);

        System.out.println("String" + 123);
    }

    public static void usefulMethod() {
        short maxShortValue = Short.MAX_VALUE;

        boolean doubleIsNan =  Double.isNaN(2.2);

        float floatInfinity = Float.POSITIVE_INFINITY;

        System.out.println(maxShortValue);
    }
}
