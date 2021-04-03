package com.example.demo.mentor.task;

public class Lecture_2_3_10 {
    public static void main(String[] args) {
        boolean isEquals = isPalindrome("Was it a cat I saw");

        System.out.println(isEquals);
    }

    public static boolean isPalindrome(String text) {
        String clearedText = text.replaceAll("[^a-zA-Z0-9]", "");
        String reversText = new StringBuilder(clearedText).reverse().toString();

        return clearedText.equalsIgnoreCase(reversText);
    }

}
