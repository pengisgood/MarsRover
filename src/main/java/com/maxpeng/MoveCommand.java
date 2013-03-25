package com.maxpeng;

/**
 * User: maxpeng
 * Date: 3/24/13
 * Time: 1:03 PM
 * Project:MarsRover
 */
public class MoveCommand implements Command {
    private final Rover rover;

    public MoveCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        this.rover.move();
    }
}
