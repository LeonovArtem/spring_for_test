package com.example.demo.shild_book.OOP.Polimorf;

public class Order implements StatisticInterface{
    @Override
    public void saveStatistic() {
        System.out.println("Сохраняем статистику заказа!");
    }
}
