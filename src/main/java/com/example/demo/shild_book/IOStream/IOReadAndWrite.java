package com.example.demo.shild_book.IOStream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class IOReadAndWrite {
    private static final String inputFilePath = "files" + File.separator + "input_file.txt";
    private static final String outputFilePath = "files" + File.separator + "output_file.txt";

    public static void main(String[] args) {
//        demoInputOutput();
//        demoReaderAndWriter();
        encodeDemo();

    }

    private static void encodeDemo() {
        try (
                FileInputStream fileInputStream = new FileInputStream(inputFilePath);
                Reader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                Writer fileOutput = new FileWriter(outputFilePath);
        ) {
            char[] buffer = new char[4];
            while (bufferedReader.ready()){
                String  line =  bufferedReader.readLine();

               System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void demoReaderAndWriter() {
        try (
                Reader reader = new FileReader(inputFilePath);
                Writer writer = new FileWriter(outputFilePath);
        ) {
            char[] buffer = new char[3];
            while (reader.ready()) {
                int element = reader.read(buffer);
                writer.write(buffer, 0, element);

                System.out.println(buffer);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void demoInputOutput() {
        try (
                FileInputStream fileInput = new FileInputStream(inputFilePath);
                FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);
        ) {
            byte[] buffer = new byte[3];
            while (fileInput.available() > 0) {
                int real = fileInput.read(buffer);
                fileOutputStream.write(buffer, 0, real);
                System.out.println(Arrays.asList(buffer));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
