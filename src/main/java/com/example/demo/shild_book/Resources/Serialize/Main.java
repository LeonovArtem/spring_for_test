package com.example.demo.shild_book.Resources.Serialize;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static final String INPUT_FILE = "files/input_file.bin";

    public static void main(String[] args) {
//        writeObjects();
        readObjects();
    }

    private static void readObjects() {
        try (
                FileInputStream file = new FileInputStream(INPUT_FILE);
                ObjectInputStream objectInputStream = new ObjectInputStream(file);
        ) {
            Person[] people = (Person[]) objectInputStream.readObject();
            System.out.println(Arrays.toString(people));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void writeObjects() {
        Person person_1 = new Person(1, "Artem");
        Person person_2 = new Person(2, "Bob");
        Person[] peoples = {person_1, person_2};
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(INPUT_FILE);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(peoples);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
