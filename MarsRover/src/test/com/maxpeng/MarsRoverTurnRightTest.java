package com.maxpeng;

import org.junit.Test;

import static com.maxpeng.Position.position;
import static com.maxpeng.Rover.rover;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: maxpeng
 * Date: 13-3-19
 * Time: 上午8:40
 * version: 0.1
 */
public class MarsRoverTurnRightTest {

    @Test
    public void should_face_south_given_east() throws Exception {
        Rover rover = rover(Direction.EAST, position(0, 0));
        rover.turnRight();
        assertThat(rover.direction(), is(Direction.SOUTH));
    }

    @Test
    public void should_face_east_given_north() throws Exception {
        Rover rover = rover(Direction.NORTH, position(0, 0));
        rover.turnRight();
        assertThat(rover.direction(), is(Direction.EAST));
    }

    @Test
    public void should_face_north_given_west() throws Exception {
        Rover rover = rover(Direction.WEST, position(0, 0));
        rover.turnRight();
        assertThat(rover.direction(), is(Direction.NORTH));
    }

    @Test
    public void should_face_west_given_south() throws Exception {
        Rover rover = rover(Direction.SOUTH, position(0, 0));
        rover.turnRight();
        assertThat(rover.direction(), is(Direction.WEST));
    }

    @Test
    public void should_stay_origin_position_given_east() throws Exception {
        Rover rover = rover(Direction.EAST, position(0, 0));
        rover.turnRight();
        assertThat(rover.position(), is(position(0, 0)));
    }

    @Test
    public void should_stay_origin_position_given_south() throws Exception {
        Rover rover = rover(Direction.SOUTH, position(0, 0));
        rover.turnRight();
        assertThat(rover.position(), is(position(0, 0)));
    }

    @Test
    public void should_stay_origin_position_given_west() throws Exception {
        Rover rover = rover(Direction.WEST, position(0, 0));
        rover.turnRight();
        assertThat(rover.position(), is(position(0, 0)));
    }

    @Test
    public void should_stay_origin_position_given_north() throws Exception {
        Rover rover = rover(Direction.NORTH, position(0, 0));
        rover.turnRight();
        assertThat(rover.position(), is(position(0, 0)));
    }
}