package com.example.demo.javaRush.level1;

/**
 * Внутренние классы бывают статические и нестатические.
 * Статические классы еще называют вложенными (static nested class),
 * нестатические просто называют внутренними классами (inner class).
 */
public class Car {
    //напишите тут ваш код
    private Engine engine;

    public static void main(String[] args) {
        //напишите тут ваш код
        Car car = new Car();
        car.engine = new Engine();
    }

    // вложенный класс
    protected static class Engine {
        private boolean isRunning;

        public void start() {
            this.isRunning = true;
        }

        public void stop() {
            this.isRunning = false;
        }

        public void run(){
            System.out.println("Run!");
        }
    }
}