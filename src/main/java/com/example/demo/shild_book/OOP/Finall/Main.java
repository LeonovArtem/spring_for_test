package com.example.demo.shild_book.OOP.Finall;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(99);
        User user2 = new User(32);
        user1.calculateSum(2,6);

        ArrayList<User> userList = new ArrayList<>(2);
        userList.add(user1);
        userList.add(user2);
        userList.add(user2);
        userList.add(user2);

        System.out.println("Done");
    }

    static class User {
        private final int age;

        public User(int age) {
            this.age = age;
        }

        public void calculateSum(final int a, int b) {
            // Нельзя переопределить
            //a = 999;
            final int res = a + b;

            // Нельзя переопределить
            // res = 44;

            System.out.println(res);
        }
    }
}
