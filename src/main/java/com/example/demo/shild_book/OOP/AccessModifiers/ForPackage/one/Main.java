package com.example.demo.shild_book.OOP.AccessModifiers.ForPackage.one;

/**
 * Всего в Java есть четыре модификатора доступа. Перечислим их в порядке от самых строгих до самых «мягких»:
 * 1) <private>
 * 2) <protected> - в пределах всех классов, находящихся в том же пакете, что и наш; в пределах всех классов-наследников нашего класса.
 * 3) <default> (package visible) - По сути, default = <protected> минус наследование :)
 * 4) <public>
 */
public class Main {
    public static void main(String[] args) {
        tryPrintProtected();
        tryPrintDefault();
    }

    private static void tryPrintProtected() {
        User user = new VipUser();

        System.out.println(user.protectedStatus);
    }

    private static void tryPrintDefault() {
        User user = new VipUser();

        System.out.println(user.defaultSurName);
    }
}
