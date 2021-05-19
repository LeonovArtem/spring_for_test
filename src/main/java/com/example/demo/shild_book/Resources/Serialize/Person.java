package com.example.demo.shild_book.Resources.Serialize;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = -4148576601376575548L;

    private int id;

    private int age;

    // transient - исключить из сериализации
    private transient String fullName;

    public Person(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + fullName + '\'' +
                '}';
    }
}
