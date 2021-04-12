package com.example.demo.shild_book.OOP.Constructor;

public class UserWithPrivateConstructor {
    private String name;
    private int age;

    private static final int DEFAULT_AGE = 999;

    public static void main(String[] args) {
        UserWithPrivateConstructor user1 = new UserWithPrivateConstructor();
        System.gc();
    }

    protected UserWithPrivateConstructor() {
        System.out.println("Нельзя создать объект");
    }

    public UserWithPrivateConstructor(int age) {
        this.age = age;
    }


    public UserWithPrivateConstructor(String name) {
        this.name = name;
    }

    public UserWithPrivateConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        UserWithPrivateConstructor user1 = new UserWithPrivateConstructor();
        UserWithPrivateConstructor user2 = new UserWithPrivateConstructor(99);
        UserWithPrivateConstructor user3 = new UserWithPrivateConstructor("Artem");
    }
}
