package com.example.demo.mentor.task;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-64));
    }

public static boolean isPowerOfTwo(int value) {
    return Integer.bitCount(Math.abs(value)) == 1;
}

}
