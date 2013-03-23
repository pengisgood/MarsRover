package com.maxpeng;

/**
 * User: maxpeng
 * Date: 13-3-19
 * Time: 上午8:28
 * version: 0.1
 */
public class Position {
    private int x;
    private int y;

    private Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Position position(int x, int y) {
        return new Position(x, y);
    }

    public void add(int x, int y){
        this.x += x;
        this.y += y;
    }

    public void sub(int x, int y) {
        this.x -= x;
        this.y -= y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position)obj;
        return position.x == this.x && position.y == this.y;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
