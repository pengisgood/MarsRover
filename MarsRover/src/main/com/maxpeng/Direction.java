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

    EAST('E') {
        public char convertToChar() {
            return 'E';
        }
    },
    SOUTH('S') {
        public char convertToChar() {
            return 'S';
        }
    },
    WEST('W') {
        public char convertToChar() {
            return 'W';
        }
    },
    NORTH('N') {
        public char convertToChar() {
            return 'N';
        }
    };


    abstract public char convertToChar();

    private char direction;
    public static final ArrayList DIRECTIONS = new ArrayList(Arrays.asList(EAST, SOUTH, WEST, NORTH));


    Direction(char direction) {
        this.direction = direction;
    }

}
