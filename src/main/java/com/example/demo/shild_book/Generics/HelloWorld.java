package com.example.demo.shild_book.Generics;

import java.util.*;

public class HelloWorld {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        AnimalList<Animal> animalAnimalList = new AnimalList<>();

    }

    private static void beforeGeneric() {
        List animals = new ArrayList();
        Animal animal1 = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add(animal1);

        System.out.println(animals);
        String cat = (String) animals.get(1);
        System.out.println(cat);
    }

    public static void genericExample() {
        List<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");

        // java: incompatible types: cannot be converted to java.lang.String
        /* animals.add(new Animal()); */
    }

    public static void genericExampleForJavaMore7() {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
    }

    static class AnimalList<T extends Animal> {
        List<T> animals;

        public AnimalList() {
        }

        public AnimalList(List<T> animals) {
            this.animals = animals;
        }

        public List<T> getAnimals() {
            return animals;
        }

        public void add(T animal) {
            animals.add(animal);
        }
    }

    static class Animal {
        @Override
        public String toString() {
            return "It is animal object";
        }
    }
}
