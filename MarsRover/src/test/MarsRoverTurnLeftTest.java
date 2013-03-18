import com.maxpeng.Rover;
import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

/**
 * User: maxpeng
 * Date: 13-3-18
 * Time: 下午10:48
 * version: 0.1
 */
public class MarsRoverTurnLeftTest {

    @Test
    public void should_face_north_given_east() throws Exception {
        Rover rover = new Rover('E');
        rover.turnLeft();
        Assert.assertThat(rover.getDirection(), is('N'));
    }
}
