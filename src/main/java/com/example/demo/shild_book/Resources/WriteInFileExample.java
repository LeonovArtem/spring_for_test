package com.example.demo.shild_book.Resources;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteInFileExample {
    public static void main(String[] args) {
        firstExample();
        moreBetter();
    }

    public static void firstExample() {
        try {
            String path = "c:" + File.separator + "projects" + File.separator + "log.txt";

            FileOutputStream output = new FileOutputStream(path);

            String name = "Artem";
            output.write(name.getBytes(StandardCharsets.UTF_8));
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SneakyThrows
    public static void moreBetter() {
        String path = "c:" + File.separator + "projects" + File.separator + "log.txt";

        FileOutputStream output = null;
        //noinspection ControlFlowStatementWithoutBraces
        try {
            String name = new Throwable().getStackTrace()[0].getMethodName();
            output = new FileOutputStream(path);
            output.write(name.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) output.close();
        }
    }

    public static void tryWithResource() {
        String path = "c:" + File.separator + "projects" + File.separator + "log.txt";

        try (FileOutputStream output = new FileOutputStream(path)) {
            output.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
