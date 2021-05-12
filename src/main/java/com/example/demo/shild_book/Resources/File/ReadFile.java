package com.example.demo.shild_book.Resources.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
//        scannerExample();

        String filePath = "c:" +
                File.separatorChar +
                "Users/Artem/Desktop" +
                File.separatorChar + "test_file.txt";
        File file = new File(filePath);

//        readLinesWithScanner(file);
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(line.split(";"))
                                        .filter(s -> !s.isEmpty())
                                        .map(Integer::parseInt)
                                        .collect(Collectors.toList());
        System.out.println(numbers);
    }

    private static void readLinesWithScanner(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }


    private static void scannerExample() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("Вы ввели: " + input);
    }


}
