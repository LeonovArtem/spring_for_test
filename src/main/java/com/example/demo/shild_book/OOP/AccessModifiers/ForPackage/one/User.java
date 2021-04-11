package com.example.demo.shild_book.OOP.AccessModifiers.ForPackage.one;

/**
 * Всего в Java есть четыре модификатора доступа. Перечислим их в порядке от самых строгих до самых «мягких»:
 * 1) <private>
 * 2) <protected> - в пределах всех классов, находящихся в том же пакете, что и наш; в пределах всех классов-наследников нашего класса.
 * 3) <default> (package visible) - По сути, default = protected-наследование :)
 * 4) <public>
 */
public class User {
    public String publicName = "Artem";
    String defaultSurName = "Leonov";
    protected String protectedStatus = "CREATED";
    private int privateAge = 32;

    public void printAge() {
        System.out.println(this.privateAge);
    }
}
