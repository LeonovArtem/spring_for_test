package com.example.demo.patterns.adapter;

import com.example.demo.patterns.adapter.objects.PrinterAdapter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Помогает 2 разным интерфейсам работать вместе
 * Реализуется 2 способами:
 * 1) Наследование
 * 2) Композиция
 *
 * Применимость: Паттерн можно часто встретить в Java-коде, особенно там,
 * где требуется конвертация разных типов данных или совместная работа классов с разными интерфейсами.
 *
 * java.util.Arrays#asList()
 * java.util.Collections#list()
 * java.util.Collections#enumeration()
 */
public class Adapter {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two");
        PrinterAdapter printerAdapter = new  PrinterAdapter();
        printerAdapter.print(list);
    }
}
