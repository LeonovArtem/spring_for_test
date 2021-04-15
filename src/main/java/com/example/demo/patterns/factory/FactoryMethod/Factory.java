package com.example.demo.patterns.factory.FactoryMethod;

import com.example.demo.patterns.factory.FactoryMethod.Cars.Ferrari;
import com.example.demo.patterns.factory.FactoryMethod.Cars.Jeep;
import com.example.demo.patterns.factory.FactoryMethod.Cars.Toyota;

/**
 * Фабричный метод (Виртуальный конструктор)
 * Исаользование:
 * 1) Известен интерфейс, но заранее не известно какая реализация будет использоваться
 * 2) Получение ссылки на объект в зависимости от входящих условий
 */
public class Factory {
    public CarInterface getCarByModel(CarModel carModel) {
        switch (carModel){
            case JEEP:
                return new Jeep();
            case TOYOTA:
                return new Toyota();
            default:
                return new Ferrari();
        }
    }
}
