package com.example.demo.patterns.adapter.objects;

import java.util.List;

public class PrinterAdapter implements PageListPrint {
    private Printer printer = new Printer();

    @Override
    public void print(List<String> list) {
        for (String str : list) {
            printer.printOnePage(str);
        }
    }
}
