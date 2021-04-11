package com.example.demo.shild_book.OOP.Polimorf;

/**
 * Касаясь вопроса полиморфизма и нововведений в Java, можно упомянуть, что при создании абстрактных классов и интерфейсов,
 * начиная с Java 8, есть возможность написания дефолтной реализации абстрактных методов
 * в базовых классах с помощью ключевого слова default.
 *
 * Иногда могут задать вопрос о требованиях к объявлению методов в базовых классах, чтобы не нарушался принцип полиморфизма.
 * Тут все просто: эти методы <НЕ ДОЛЖНЫ> быть static, private и final.
 * <Private> делает метод доступным только в классе, и вы не сможете его переопределить в наследнике.
 * <Static> делает метод достоянием класса, а не объекта, поэтому всегда будет вызываться метод суперкласса.
 * <Final> же сделает метод неизменяемым и скрытым от наследников
 */
public interface StatisticInterface {
    void saveStatistic();


    default void exampleDefault() {
        System.out.println("exampleDefault!");
    }
}
