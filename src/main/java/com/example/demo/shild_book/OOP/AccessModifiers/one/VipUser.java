package com.example.demo.shild_book.OOP.AccessModifiers.one;

public class VipUser extends User{
    private int privateAge = 21;

    public static void main(String[] args) {
        tryPrintProtected();
        tryPrintDefault();
    }

    private static void tryPrintProtected() {
        User user = new VipUser();

        System.out.println(user.protectedStatus);
    }

    private static void tryPrintDefault() {
        User user = new VipUser();

        System.out.println(user.defaultSurName);
    }
}
