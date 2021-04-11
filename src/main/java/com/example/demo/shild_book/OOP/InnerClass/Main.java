package com.example.demo.shild_book.OOP.InnerClass;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = new Car.Engine();
        engine.run();
    }
}
