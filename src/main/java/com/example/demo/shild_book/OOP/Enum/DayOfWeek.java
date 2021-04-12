package com.example.demo.shild_book.OOP.Enum;

public enum DayOfWeek {
    MONDAY(1),
    TUESDAY(3),
    WEDNESDAY(5),
    THURSDAY(7),
    FRIDAY(8),
    SATURDAY(1),
    SUNDAY(1);

    public int maxCalled;

    DayOfWeek(int maxCalled) {
        this.maxCalled = maxCalled;
    }
}
