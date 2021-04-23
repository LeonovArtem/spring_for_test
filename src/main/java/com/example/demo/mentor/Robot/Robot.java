package com.example.demo.mentor.Robot;

import com.example.demo.mentor.Robot.Exception.RobotConnectionException;

public class Robot {
    public static void main(String[] args) {
        RobotConnectionManager robotConnectionManager = new RobotConnectionManager();
        moveRobot(robotConnectionManager, 2, 2);
    }


    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int countAttempt = 0;
        while (countAttempt < 3) {
            try {
                robotConnectionManager.getConnection().moveRobotTo(toX, toY);
                countAttempt = 3;
            } catch (RobotConnectionException e) {
                countAttempt++;
                if (countAttempt == 3) {
                    throw e;
                }
            } catch (Exception e) {

            } finally {
                try {
                    robotConnectionManager.getConnection().close();
                } catch (RobotConnectionException e) {
                }
            }
        }
    }


/*    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int countAttempt = 0;
        while (countAttempt < 3) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(toX, toY);
                countAttempt = 3;
            } catch (RobotConnectionException e) {
                ++countAttempt;
                if (countAttempt == 3) {
                    throw e;
                }
            }
        }
    }*/
}
