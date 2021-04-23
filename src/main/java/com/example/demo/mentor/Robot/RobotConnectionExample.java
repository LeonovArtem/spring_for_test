package com.example.demo.mentor.Robot;

public class RobotConnectionExample implements RobotConnection{
    @Override
    public void moveRobotTo(int x, int y) {

    }

    @Override
    public void close() {
        System.out.println("close");
    }
}
