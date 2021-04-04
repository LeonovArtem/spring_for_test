package com.example.demo.shild_book.scope;

public class Scope {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10) {
            int y = 20;

            System.out.printf("x и y: %s, %s ", x, y);
        }
        // Ошибка! y - недоступен в этой области действия
        // y = 200;

        moreExample();
    }

    // переменные создаются при входе в их область действия и уничтожаются при выходе из нее
    private static void moreExample() {
        int a = 20;
        {
            int b = 100;
            int c = a + b;
            EmptyClass emptyObj = new EmptyClass();


            System.out.println("a+b=" + c);
        }

        // emptyObj, b , c - уничтожаются

        System.out.println("Done!");
    }

    static class EmptyClass {

    }
}
