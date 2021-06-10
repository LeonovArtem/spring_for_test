package com.example.demo.mentor.task;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Привет");
        list.add("Hello");
        list.add("Hola");
        list.add("Bonjour");
        list.add("Cialo");
        list.add("Namaste");


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals("Hello")) {
                iterator.remove();
            }
        }
    }
}
