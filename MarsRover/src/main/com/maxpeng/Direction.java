package com.maxpeng;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * User: maxpeng
 * Date: 13-3-19
 * Time: 下午9:31
 * version: 0.1
 */
public enum Direction {
    EAST, SOUTH, WEST, NORTH;

    public static final ArrayList DIRECTIONS = new ArrayList(Arrays.asList(EAST, SOUTH, WEST, NORTH));
}
