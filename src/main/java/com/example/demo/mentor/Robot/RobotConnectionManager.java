package com.example.demo.mentor.Robot;

import com.example.demo.mentor.Robot.Exception.RobotConnectionException;

public class RobotConnectionManager implements RobotConnectionManagerInterface {
    public int countCalled = 0;

    @Override
    public RobotConnection getConnection() {
        ++countCalled;
        if (countCalled < 3) {
            throw new RobotConnectionException("wrong");
        }

        return new RobotConnectionExample();
    }
}
