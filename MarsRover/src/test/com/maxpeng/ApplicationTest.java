package com.maxpeng;

import org.junit.Test;

import static com.maxpeng.Position.position;
import static com.maxpeng.Rover.rover;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * User: Administrator
 * Date: 3/23/13
 * Time: 6:02 PM
 * Project: MarsRover
 * version: 0.1
 */
public class ApplicationTest {

    @Test
    public void rover_turn_left_given_command_L() throws Exception {
        Rover rover = rover(Direction.EAST, position(0, 0));
        Application app = new Application(rover);
        app.receive('L');
        assertThat(rover.direction(), is(Direction.NORTH));
    }

    @Test
    public void rover_turn_right_given_command_R() throws Exception {
        Rover rover = rover(Direction.EAST, position(0, 0));
        Application app = new Application(rover);
        app.receive('R');
        assertThat(rover.direction(), is(Direction.SOUTH));
    }

    @Test
    public void rover_move_toward_east_given_command_M() throws Exception {
        Rover rover = rover(Direction.EAST, position(0, 0));
        Application app = new Application(rover);
        app.receive('M');
        assertThat(rover.position(), is(position(1, 0)));
    }

    @Test
    public void rover_move_toward_north_given_command_M() throws Exception {
        Rover rover = rover(Direction.NORTH, position(0, 0));
        Application app = new Application(rover);
        app.receive('M');
        assertThat(rover.position(), is(position(0, 1)));
    }

    @Test
    public void rover_move_toward_west_given_command_M() throws Exception {
        Rover rover = rover(Direction.WEST, position(0, 0));
        Application app = new Application(rover);
        app.receive('M');
        assertThat(rover.position(), is(position(-1, 0)));
    }

    @Test
    public void rover_move_toward_south_given_command_M() throws Exception {
        Rover rover = rover(Direction.SOUTH, position(0, 0));
        Application app = new Application(rover);
        app.receive('M');
        assertThat(rover.position(), is(position(0, -1)));
    }
}
