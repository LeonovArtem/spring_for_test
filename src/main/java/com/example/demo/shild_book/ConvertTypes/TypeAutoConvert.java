package com.example.demo.shild_book.ConvertTypes;

/**
 * Когда данные одного типа присваиваются переменной другого типа, выполняется
 * автоматическое преобразование типов, если удовлетворяются два условия:
 * 1) оба типа совместимы
 * 2) длина целевого типа больше длины исходного
 * При соблюдении этих условий выполняется <Расширяющее преобразование>.
 *
 * Не существует автоматического преобразования Числовых типов(byte, short, int, long) в boolean и char !
 * boolean и char также несовместимы друг с другом
 */
public class TypeAutoConvert {
    public static void main(String[] args) {
        extendedConvert();
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
}
