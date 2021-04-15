package com.example.demo.mentor.task;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "one";
        String str2 = "one";
        String str3 = new String("one").intern();

        boolean isEquals1 = str1 == str2;
        boolean isEquals2 = str1 == str3;
        System.out.println("str1 == str2: " + isEquals1);
        System.out.println("str1 == str3: " + isEquals2);
    }
}
