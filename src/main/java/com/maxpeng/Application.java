package com.maxpeng;

/**
 * User: Administrator
 * Date: 3/23/13
 * Time: 6:04 PM
 * Project: MarsRover
 * version: 0.1
 */
public class Application {

    private final Rover rover;

    public Application(Rover rover) {
        this.rover = rover;
    }

    public void receiveCommand(char commandLetter) {

        if (commandLetter == 'L') {
            rover.turnLeft();
        }

        if (commandLetter == 'R') {
            rover.turnRight();
        }

        if (commandLetter == 'M') {
            rover.move();
        }

    }

}
