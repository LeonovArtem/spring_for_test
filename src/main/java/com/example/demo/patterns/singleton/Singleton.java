package com.example.demo.patterns.singleton;

public final class Singleton {
    private static Singleton instance;

    public static Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }

        return instance;
    }

    private Singleton() {
    }

    public void printInfo() {
        System.out.println(this);
    }
}
