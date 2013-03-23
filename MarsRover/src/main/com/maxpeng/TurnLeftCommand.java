package com.maxpeng;

import java.util.ArrayList;

/**
 * User: maxpeng
 * Date: 13-3-19
 * Time: 下午3:40
 * version: 0.1
 */
public class TurnLeftCommand implements Command {

    @Override
    public void execute(Object obj) {
        Rover rover = (Rover)obj;
        rover.turnLeft();
    }
}
