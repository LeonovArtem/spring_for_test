package com.example.demo.shild_book.ConvertTypes;

/**
 * Аввтоматическое продвижение типов
 * <p>
 * в Java тип каждого операнда <byte>,<short>,<char> автоматически продвигается к типу <int>
 */
public class AutoPromotingTypes {
    public static void main(String[] args) {
        byte a = 40;
        byte b = 50;
        byte c = 100;
        // а * Ь выполняется с помощью целочисленных, а не байтовых значений.
        int d = a * b / c;
        System.out.println(c);
        System.out.println(a * b);
    }

    static class ErrorPromotingTypes {
        public static void main(String[] args) {
            byte b = 10;
            // Ошибка! possible lossy conversion from int to byte
            //b = b * 2;

            b = (byte) (b * 2);

            System.out.println(b);
        }
    }

    /**
     * <byte>,<short>,<char> автоматически продвигается к типу <int>
     */
    static class MoreExample {
        // к типу <long>, если один из его операндов относится к типу long
        long longValue = 2L;
        long longResult = longValue * 2;

        // к типу <float>, если один из его операндов float
        float floatValue = 2.3f;
        float floatResult = floatValue + 2;

        // аналогично с double
        double doubleValue = 2.31;
        double doubleResult = doubleValue + 2;

        public static void main(String[] args) {
            StringBuilder str = new StringBuilder();
            MoreExample obj = new MoreExample();
            str
                    .append("longValue:" + obj.longValue + "\n")
                    .append("longResult:" + obj.longResult + "\n")

            ;

            System.out.println(str);
        }
    }
}
