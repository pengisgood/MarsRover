package com.maxpeng;

import com.maxpeng.Point;
import com.maxpeng.Rover;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: maxpeng
 * Date: 13-3-18
 * Time: 下午10:48
 * version: 0.1
 */
public class MarsRoverTurnLeftTest {

    private Rover rover;
    private Point defaultPosition;

    @Before
    public void setUp() throws Exception {
        rover = new Rover();
        defaultPosition = new Point(0, 0);
    }

    @Test
    public void should_face_north_given_east() throws Exception {
        rover.setDirection('E');
        rover.turnLeft();
        assertThat(rover.getDirection(), is('N'));
    }

    @Test
    public void should_face_west_given_north() throws Exception {
        rover.setDirection('N');
        rover.turnLeft();
        assertThat(rover.getDirection(), is('W'));
    }

    @Test
    public void should_face_south_given_west() throws Exception {
        rover.setDirection('W');
        rover.turnLeft();
        assertThat(rover.getDirection(), is('S'));
    }

    @Test
    public void should_face_east_given_south() throws Exception {
        rover.setDirection('S');
        rover.turnLeft();
        assertThat(rover.getDirection(), is('E'));
    }

    @Test
    public void should_stay_origin_position_given_east() throws Exception {
        rover.setDirection('E');
        rover.turnLeft();
        assertThat(rover.getPosition(), is(defaultPosition));
    }

    @Test
    public void should_stay_origin_position_given_west() throws Exception {
        rover.setDirection('W');
        rover.turnLeft();
        assertThat(rover.getPosition(), is(defaultPosition));
    }

    @Test
    public void should_stay_origin_position_given_north() throws Exception {
        rover.setDirection('N');
        rover.turnLeft();
        assertThat(rover.getPosition(), is(defaultPosition));
    }

    @Test
    public void should_stay_origin_position_given_south() throws Exception {
        rover.setDirection('S');
        rover.turnLeft();
        assertThat(rover.getPosition(), is(defaultPosition));
    }
}
