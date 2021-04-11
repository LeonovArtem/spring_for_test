package com.example.demo.shild_book.OOP.Polimorf;

public class Coupon implements StatisticInterface{
    @Override
    public void saveStatistic() {
        System.out.println("Сохраняем статистику по купону");
    }
}
