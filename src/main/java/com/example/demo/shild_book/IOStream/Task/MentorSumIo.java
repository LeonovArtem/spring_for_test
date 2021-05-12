package com.example.demo.shild_book.IOStream.Task;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class MentorSumIo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();

        System.out.println(filePath);
    }

    public int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        while (inputStream.available() > 0) {
            sum += (byte) inputStream.read();
        }

        return sum;
    }
}
