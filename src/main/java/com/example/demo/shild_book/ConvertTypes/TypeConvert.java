package com.example.demo.shild_book.ConvertTypes;

/**
 * Явное приведение
 */
public class TypeConvert {
    public static void main(String[] args) {
        lessConvert();
        floatToInt();
    }

    /**
     * <Сужающее преобразование>
     * Чтобы выполнить преобразование двух несовместимых типов данных, нужно
     * воспользоваться приведением типов. Приведение - это всего лишь явное преобразование типов.
     */
    private static void lessConvert() {
        int intVar = 35000;
        short intToShort = (short) intVar;

        System.out.println(intToShort);

    }

    private static void floatToInt() {
        float floatVar = 3.23456F;
        // = 3 - происходит усечение (отбрасывание дробной части)
        int floatToInt = (int) floatVar;

        System.out.printf("floatVar = %s; floatToInt = %s", floatVar, floatToInt);
    }

    static class MoreExample {
        public static void main(String[] args) {
            int varInt = 1_000_000;
            short intToShort = (short) varInt;

            System.out.println(intToShort);
        }
    }
}
