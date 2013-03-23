package com.maxpeng;

/**
 * User: maxpeng
 * Date: 13-3-18
 * Time: 下午11:02
 * version: 0.1
 */
public class Rover {
    private Position position;
    private Direction direction;

    private Rover(Direction direction, Position position){
        this.direction = direction;
        this.position = position;
    }

    public static Rover rover(Direction direction, Position position) {
        return new Rover(direction, position);
    }

    public Direction direction() {
        return this.direction;
    }

    public Position position() {
        return this.position;
    }

    public void turnLeft() {
        this.direction = (Direction) Direction.DIRECTIONS.get((getIndex() - 1 + getSize()) % getSize());
    }

    public void turnRight() {
        this.direction = (Direction) Direction.DIRECTIONS.get((getIndex() + 1) % getSize());
    }

    public void move() {

        switch (this.direction){
            case EAST:
                this.position.add(1, 0);
                break;
            case SOUTH:
                this.position.sub(0, 1);
                break;
            case WEST:
                this.position.sub(1, 0);
                break;
            case NORTH:
                this.position.add(0, 1);
                break;
        }
    }

    private int getIndex() {
        return Direction.DIRECTIONS.indexOf(this.direction());
    }

    private int getSize() {
        return Direction.DIRECTIONS.size();
    }
}
