package com.example.demo.mentor.Module_2_3;

import java.util.BitSet;

public class PrepareToReview {
    public static void main(String[] args) {
        answer1();
    }

    private static void answer1() {
        float a = 0.1f;
        float b = 0.7f;
        float c = 0.8f;

        float res = (a + b);
        System.out.println(res);
        System.out.println(res == c);
        System.out.println((a + b) == c);

        if (0.1 + 0.7 == 0.8) {
            System.out.println("isEquals");
        } else {
            System.out.println("isNotEquals");
        }
    }

    private static void example1() {
        BitSet bitSet = new BitSet();
    }
}
