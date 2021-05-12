package com.example.demo.shild_book.IOStream.FileSystem;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File dir = new File("files");
        String[] inFile = dir.list((dir1, name) -> name.startsWith("input"));

        System.out.println(Arrays.asList(inFile));
    }
}
