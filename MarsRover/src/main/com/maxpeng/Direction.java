package com.maxpeng;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * User: maxpeng
 * Date: 13-3-19
 * Time: 下午9:31
 * version: 0.1
 */
public enum Direction {
    EAST, SOUTH, WEST, NORTH;

    private final static Map<Direction,List<Direction>> directionMap;

    static {
        directionMap = new HashMap<Direction, List<Direction>>();
        directionMap.put(EAST, asList(NORTH, SOUTH));
        directionMap.put(NORTH, asList(WEST, EAST));
        directionMap.put(WEST, asList(SOUTH, NORTH));
        directionMap.put(SOUTH, asList(EAST, WEST));

        Collections.unmodifiableMap(directionMap);
    }

    public static Direction left(Direction direction) {
        return directionMap.get(direction).get(0);
    }

    public static Direction right(Direction direction) {
        return directionMap.get(direction).get(1);
    }
}
