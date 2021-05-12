package com.example.demo.mentor.task.Car;

import java.io.IOException;

public class Main implements AutoCloseable{
    static int number = 0;
    public static void main(String[] args){
        try(Main ex1 = new Main();
            Main ex2 = new Main()){
            throw new RuntimeException("Main exception");
        } catch (Exception e){
            System.out.println(e.getMessage());
            for(Throwable t : e.getSuppressed()){
                System.out.println(t.getMessage());
            }
        }
    }

    @Override
    public void close() throws Error{
        throw new Error("Suppressed Exception");
    }
}
