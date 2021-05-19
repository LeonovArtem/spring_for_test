package com.example.demo.shild_book.Resources.Serialize;

import java.io.*;

public class Main {
    public static final String INPUT_FILE = "files/input_file.bin";

    public static void main(String[] args) {
        writeObjects();
        readObjects();
    }

    private static void readObjects() {
        try (
                FileInputStream file = new FileInputStream(INPUT_FILE);
                ObjectInputStream objectInputStream = new ObjectInputStream(file);
        ) {
            Person person_1 = (Person) objectInputStream.readObject();
            Person person_2 = (Person) objectInputStream.readObject();

            System.out.println(person_1);
            System.out.println(person_2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void writeObjects() {
        Person person_1 = new Person(1, "Artem");
        Person person_2 = new Person(2, "Bob");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(INPUT_FILE);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person_1);
            objectOutputStream.writeObject(person_2);

            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
