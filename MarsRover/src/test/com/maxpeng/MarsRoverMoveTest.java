package com.maxpeng;

import com.maxpeng.Point;
import com.maxpeng.Rover;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: maxpeng
 * Date: 13-3-19
 * Time: 上午11:48
 * version: 0.1
 */
public class MarsRoverMoveTest {

    private Rover rover;

    @Before
    public void setUp() throws Exception {
        rover = new Rover();
    }

    @Test
    public void should_add_y_facing_north() throws Exception {
        rover.setDirection('N');
        rover.move();
        assertThat(rover.getPosition(), is(new Point(0, 1)));
    }

    @Test
    public void should_add_x_facing_east() throws Exception {
        rover.setDirection('E');
        rover.move();
        assertThat(rover.getPosition(), is(new Point(1, 0)));
    }

    @Test
    public void should_sub_y_facing_north() throws Exception {
        rover.setDirection('S');
        rover.move();
        assertThat(rover.getPosition(), is(new Point(0, -1)));
    }

    @Test
    public void should_sub_x_facing_west() throws Exception {
        rover.setDirection('W');
        rover.move();
        assertThat(rover.getPosition(), is(new Point(-1, 0)));
    }

    @Test
    public void should_keep_origin_direction_facing_north() throws Exception {
        rover.setDirection('N');
        rover.move();
        assertThat(rover.getDirection(), is('N'));
    }

    @Test
    public void should_keep_origin_direction_facing_west() throws Exception {
        rover.setDirection('W');
        rover.move();
        assertThat(rover.getDirection(), is('W'));
    }

    @Test
    public void should_keep_origin_direction_facing_south() throws Exception {
        rover.setDirection('S');
        rover.move();
        assertThat(rover.getDirection(), is('S'));
    }

    @Test
    public void should_keep_origin_direction_facing_east() throws Exception {
        rover.setDirection('E');
        rover.move();
        assertThat(rover.getDirection(), is('E'));
    }
}
