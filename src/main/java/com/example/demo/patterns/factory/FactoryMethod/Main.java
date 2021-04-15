package com.example.demo.patterns.factory.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        CarInterface car1 = factory.getCarByModel(CarModel.TOYOTA);

        System.out.println(car1.getSpeed());
    }
}
