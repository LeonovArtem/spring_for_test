package com.example.demo.patterns.singleton;

public class SynchronizedSingleton {
//    private static SynchronizedSingleton instance;


    private static SynchronizedSingleton instance = new SynchronizedSingleton();

    public static synchronized SynchronizedSingleton getInstance() {
        return instance;
    }

    private SynchronizedSingleton() {
    }

    public void printInfo() {
        System.out.println(this);
    }
}
