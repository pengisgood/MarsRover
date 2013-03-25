package com.maxpeng;

import org.junit.Test;

import static com.maxpeng.Position.position;
import static com.maxpeng.Rover.rover;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: maxpeng
 * Date: 13-3-19
 * Time: 上午11:48
 * version: 0.1
 */
public class RoverMoveTest {

    @Test
    public void should_add_y_facing_north() throws Exception {
        Rover rover = rover(Direction.NORTH, position(0, 0));
        rover.move();
        assertThat(rover.position(), is(position(0, 1)));
    }

    @Test
    public void should_add_x_facing_east() throws Exception {
        Rover rover = rover(Direction.EAST, position(0, 0));
        rover.move();
        assertThat(rover.position(), is(position(1, 0)));
    }

    @Test
    public void should_sub_y_facing_north() throws Exception {
        Rover rover = rover(Direction.SOUTH, position(0, 0));
        rover.move();
        assertThat(rover.position(), is(position(0, -1)));
    }

    @Test
    public void should_sub_x_facing_west() throws Exception {
        Rover rover = rover(Direction.WEST, position(0, 0));
        rover.move();
        assertThat(rover.position(), is(position(-1, 0)));
    }

    @Test
    public void should_keep_origin_direction_facing_north() throws Exception {
        Rover rover = rover(Direction.NORTH, position(0, 0));
        rover.move();
        assertThat(rover.direction(), is(Direction.NORTH));
    }

    @Test
    public void should_keep_origin_direction_facing_west() throws Exception {
        Rover rover = rover(Direction.WEST, position(0, 0));
        rover.move();
        assertThat(rover.direction(), is(Direction.WEST));
    }

    @Test
    public void should_keep_origin_direction_facing_south() throws Exception {
        Rover rover = rover(Direction.SOUTH, position(0, 0));
        rover.move();
        assertThat(rover.direction(), is(Direction.SOUTH));
    }

    @Test
    public void should_keep_origin_direction_facing_east() throws Exception {
        Rover rover = rover(Direction.EAST, position(0, 0));
        rover.move();
        assertThat(rover.direction(), is(Direction.EAST));
    }
}
