package com.maxpeng;

/**
 * User: Administrator
 * Date: 3/23/13
 * Time: 6:42 PM
 * Project: MarsRover
 * version: 0.1
 */
public class TurnLeftCommand implements Command {

    private Rover rover;

    public TurnLeftCommand(Rover rover) {
        this.rover = rover;
    }

    public void execute() {
        this.rover.turnLeft();
    }
}
