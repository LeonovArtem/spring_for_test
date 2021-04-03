package com.example.demo.mentor.task;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human((byte) 25, "Artem", "Leonov", "Literball");
        Human human3 = new Human((byte) 25, "Artem", "Leonov");
    }

    public static class Human {
        private byte age;
        private String name;
        private String secondName;
        private String favoriteSport;

        public Human() {

        }

        public Human(byte age, String name, String secondName, String favoriteSport) {
            this.__
            this.favoriteSport = favoriteSport;
        }

        public Human(byte age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }
    }
}
