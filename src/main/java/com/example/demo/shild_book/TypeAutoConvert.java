package com.example.demo.shild_book;

/**
 * Когда данные одного типа присваиваются переменной другого типа, выполняется
 * автоматическое преобразование типов, если удовлетворяются два условия:
 * 1) оба типа совместимы
 * 2) длина целевого типа больше длины исходного
 * При соблюдении этих условий выполняется <Расширяющее преобразование>.
 * <p>
 * Не существует автоматического преобразования Числовых типов(byte, short, int, long) в boolean и char !
 * boolean и char также несовместимы друг с другом
 */
public class TypeAutoConvert {
    public static void main(String[] args) {
        extendedConvert();
        lessConvert();
    }

    /**
     * <Расширяющее преобразование>
     */
    private static void extendedConvert() {
        byte byteValue = 127;
        short byteToShort = byteValue;
        int shortToInt = byteToShort;
        long intToLong = shortToInt;

        // Ошибка: incompatible types: int cannot be converted to boolean
        //boolean intToBoolean = shortToInt;

        System.out.println("Done!");
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
}
