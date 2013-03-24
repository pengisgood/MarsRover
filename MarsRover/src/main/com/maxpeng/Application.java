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
        Command command = CommandFactory.buildCommand(commandLetter, rover);
        command.execute();
    }

}
