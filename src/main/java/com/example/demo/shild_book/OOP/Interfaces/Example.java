package com.example.demo.shild_book.OOP.Interfaces;

public class Example {

}

interface Drive {
    // Ключевое слово default - указывает, что метод с реализацией
    default void move() {
        System.out.println("move...");
    }

    void moveTo(int x);
}

/**
 * Чтобы случайно не сломать работающие программы и библиотеки, было решено,
 * что реализация методов в интерфейсах получит самый низкий приоритет при наследовании.
 */
interface Pet
{
    default void meow()
    {
        System.out.println("Мяу");
    }
}

interface Cat extends Pet
{
    void meow(); // тут мы перекрыли дефолтную реализацию ее отсутствием
}
