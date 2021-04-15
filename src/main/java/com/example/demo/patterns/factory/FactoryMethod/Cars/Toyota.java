package com.example.demo.patterns.factory.FactoryMethod.Cars;

import com.example.demo.patterns.factory.FactoryMethod.CarInterface;
import com.example.demo.patterns.factory.FactoryMethod.CarModel;

public class Toyota implements CarInterface {
    @Override
    public CarModel getModel() {
        return CarModel.TOYOTA;
    }

    @Override
    public int getSpeed() {
        return 200;
    }
}
