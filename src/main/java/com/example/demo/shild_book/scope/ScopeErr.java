package com.example.demo.shild_book.scope;

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            // ScopeErr.java: Ошибка во время компиляции - переменная bar уже определена !
            // int bar = 2;
        }
    }
}
