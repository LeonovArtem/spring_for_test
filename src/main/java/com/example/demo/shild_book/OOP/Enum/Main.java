package com.example.demo.shild_book.OOP.Enum;

public class Main {
    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.equals(DayOfWeek.FRIDAY)) {
                System.out.println(
                        day.ordinal() + ":" + day.name() + "maxCalled: " + day.maxCalled
                );
            }
        }
    }
}