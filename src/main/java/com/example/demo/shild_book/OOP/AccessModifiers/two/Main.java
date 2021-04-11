package com.example.demo.shild_book.OOP.AccessModifiers.two;

import com.example.demo.shild_book.OOP.AccessModifiers.one.User;
import com.example.demo.shild_book.OOP.AccessModifiers.one.VipUser;

public class Main {
    public static void main(String[] args) {
        tryPrintProtected();
    }

    // Нельзя из внешнего пакета обратится к protected или default
    private static void tryPrintProtected() {
        User user = new VipUser();

        System.out.println(user.publicName);
    }

    // Разница между protected и private
    static class AdminUser extends User {
        public static void main(String[] args) {
            AdminUser user = new AdminUser();

            user.tryPrintProtected();
        }

        public void tryPrintProtected() {
            System.out.println(this.protectedStatus);
        }
    }
}
