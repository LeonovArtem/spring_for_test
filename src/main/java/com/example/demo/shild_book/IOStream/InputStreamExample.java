package com.example.demo.shild_book.IOStream;

import java.io.*;
import java.util.Arrays;

public class InputStreamExample {
    private static final String filePath = "test_1.txt";

    public static void main(String[] args) throws Exception {
//        isOutputStreamExample();
//        isOutputStreamExampleWithResources();
        simpleRead();
    }

    private static void isOutputStreamExample() throws IOException {
        FileOutputStream output = null;
        try {
            output = new FileOutputStream(filePath);
            output.write('A');
            output.write('B');
            output.write('c');
            output.write(100);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null)
                output.close();
        }
    }

    private static void isOutputStreamExampleWithResources() {
        try (FileOutputStream output = new FileOutputStream(filePath)) {
            output.write('A');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void simpleRead(){
        try (
             InputStream is = new FileInputStream(filePath);
             OutputStream os = new FileOutputStream("test_2.txt", true)
        ) {

            long start = System.currentTimeMillis();

            byte[] buffer = new byte[4096];
            while (is.available() > 0) {
                int r = is.read(buffer);
                os.write(buffer, 0, r);
            }

            long end = System.currentTimeMillis();
            System.out.println("time: " + (end - start));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
