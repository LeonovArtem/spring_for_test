package com.example.demo.shild_book.Loggining;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleLogger {
    private static final Logger logger = Logger.getLogger(SimpleLogger.class.getName());

    public static void main(String[] args) {
        String userName = "Artem";
        int userAge = 33;
        User user = new User();

        logger.setLevel(Level.INFO);
        logger.log(Level.INFO, "user name: {0}", userName);
        logger.log(Level.INFO, "user name and age: {0}, {1}", new Object[]{userName, userAge});
        logger.log(Level.INFO,
                "User: {0}, {1}",
                new Object[]{user.userName, userAge}
        );
//        logger.warning("simple warning!");
    }

    static class User {
        String userName = "Artem";
        int userAge = 33;

        public static void logging() {
            Logger logger = Logger.getLogger("com.javamentor.logging.Test");
            logger.info("Все хорошо");
            logger.warning("Произошла ошибка");
        }

    }
}
