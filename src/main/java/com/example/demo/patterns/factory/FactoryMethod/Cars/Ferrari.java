package com.example.demo.patterns.factory.FactoryMethod.Cars;

import com.example.demo.patterns.factory.FactoryMethod.CarInterface;
import com.example.demo.patterns.factory.FactoryMethod.CarModel;

public class Ferrari implements CarInterface {
    @Override
    public CarModel getModel() {
        return CarModel.FERRARI;
    }

    @Override
    public int getSpeed() {
        return 305;
    }
}
