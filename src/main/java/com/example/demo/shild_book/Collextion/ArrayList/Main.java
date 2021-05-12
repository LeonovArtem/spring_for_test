package com.example.demo.shild_book.Collextion.ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100_000_000; i++) {
            arrayList.add(Integer.valueOf(i));
        }

        System.out.println(arrayList);
    }
}
