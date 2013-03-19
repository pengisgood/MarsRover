package com.maxpeng;

/**
 * User: maxpeng
 * Date: 13-3-18
 * Time: 下午11:02
 * version: 0.1
 */
public class Rover {
    private Point position;
    private char direction;

    public Rover() {
        this('E');
    }

    public Rover(char direction) {
        this(direction, new Point(0, 0));
    }

    public Rover(char direction, Point position) {
        this.direction = direction;
        this.position = position;
    }

    public char getDirection() {
        return direction;
    }

    public void turnLeft() {
        switch (this.direction){
            case 'E':
                this.direction = 'N';
                break;
            case 'N':
                this.direction = 'W';
                break;
            case 'W':
                this.direction = 'S';
                break;
            case 'S':
                this.direction = 'E';
        }
    }

    public Point getPosition() {
        return position;
    }

    public void turnRight() {
        switch (this.direction){
            case 'E':
                this.direction = 'S';
                break;
            case 'N':
                this.direction = 'E';
                break;
            case 'W':
                this.direction = 'N';
                break;
            case 'S':
                this.direction = 'W';
        }
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public void move() {
        switch (this.direction){
            case 'N':
                this.position.add(0, 1);
                break;
            case 'E':
                this.position.add(1, 0);
                break;
            case 'S':
                this.position.sub(0, 1);
                break;
            case 'W':
                this.position.sub(1, 0);
                break;
        }
    }
}
