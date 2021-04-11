package com.example.demo.shild_book.OOP.Polimorf;

public class User implements StatisticInterface {
    public String name = "Default";
    protected String surName = "";
    private int age = 21;
    String status;

    public void printStatus() {
        System.out.println("STATUS_NEW");
    }

    @Override
    public void saveStatistic() {
        System.out.println("Статистика пользователя");
    }
}
