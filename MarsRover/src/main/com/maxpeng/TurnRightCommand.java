package com.maxpeng;

/**
 * User: Administrator
 * Date: 3/23/13
 * Time: 6:44 PM
 * Project: MarsRover
 * version: 0.1
 */
public class TurnRightCommand implements Command {
    private Rover rover;

    public TurnRightCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.turnRight();
    }
}
