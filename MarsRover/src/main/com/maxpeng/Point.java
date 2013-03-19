package com.maxpeng;

/**
 * User: maxpeng
 * Date: 13-3-19
 * Time: 上午8:28
 * version: 0.1
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
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
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point)obj;
        return point.x == this.x && point.y == this.y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
