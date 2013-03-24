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

    private Rover(Direction direction, Position position) {
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
        if (this.direction.equals(Direction.EAST)) {
            this.direction = Direction.NORTH;
        }
        else if (this.direction.equals(Direction.NORTH)) {
            this.direction = Direction.WEST;
        }
        else if (this.direction.equals(Direction.WEST)) {
            this.direction = Direction.SOUTH;
        }
        else if (this.direction.equals(Direction.SOUTH)) {
            this.direction = Direction.EAST;
        }
    }

    public void turnRight() {
        if (this.direction.equals(Direction.EAST)) {
            this.direction = Direction.SOUTH;
        }
        else if (this.direction.equals(Direction.NORTH)) {
            this.direction = Direction.EAST;
        }
        else if (this.direction.equals(Direction.WEST)) {
            this.direction = Direction.NORTH;
        }
        else if (this.direction.equals(Direction.SOUTH)) {
            this.direction = Direction.WEST;
        }
    }

    public void move() {

        switch (this.direction){
            case EAST:
                this.position.add(1, 0);
                break;
            case SOUTH:
                this.position.add(0, -1);
                break;
            case WEST:
                this.position.add(-1, 0);
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
