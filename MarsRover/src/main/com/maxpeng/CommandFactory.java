package com.maxpeng;

/**
 * User: Administrator
 * Date: 3/23/13
 * Time: 6:51 PM
 * Project: MarsRover
 * version: 0.1
 */
public class CommandFactory {

    public static Command buildCommand(char commandLetter, Rover rover) {
        Command command = null;

        if (commandLetter == 'L') {
            command = new TurnLeftCommand(rover);
        }

        if (commandLetter == 'R') {
            command = new TurnRightCommand(rover);
        }

        if (commandLetter == 'M') {
            command = new MoveCommand(rover);
        }

        return command;
    }
}
