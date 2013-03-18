package com.maxpeng;

/**
 * User: maxpeng
 * Date: 13-3-18
 * Time: 下午11:02
 * version: 0.1
 */
public class Rover {
    private char direction;

    public Rover(char direction) {
        this.direction = direction;
    }

    public char getDirection() {
        return direction;
    }

    public void turnLeft() {
        this.direction = 'N';
    }
}
