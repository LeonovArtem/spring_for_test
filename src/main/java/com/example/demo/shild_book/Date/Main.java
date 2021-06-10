package com.example.demo.shild_book.Date;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr1 = new ArrayList<String>();
        var arr2 = new ArrayList<String>() {
            private static final long serialVersionUID = 2901502370306975281L;
            {
                add("new");
                add("all");
            }
        };

        arr2.add("one");
        arr2.add("two");

        System.out.println(arr2);

        ArrayList<String> stringArrayList = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        Map<String, ArrayList<String>> map = new HashMap<>();
        var exceptionsList = new ArrayList<Exception>();
        var filesStack = new Stack<File>();
    }
}