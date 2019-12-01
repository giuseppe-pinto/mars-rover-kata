import domain.Direction;
import domain.Rover;
import domain.State;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverTest
{
  private State initialState;

  @Before
  public void setUp()
  {
    Double x = (double) 0;
    Double y = (double) 0;
    Direction direction = Direction.NORTH;

    initialState = new State(x,y, direction);
  }

  @Test
  public void createRover()
  {
    Rover rover = new Rover(initialState);
    assertThat(rover.getState().getX(), is((double) 0L));
    assertThat(rover.getState().getY(), is((double) 0L));
    assertThat(rover.getState().getDirection(), is(Direction.NORTH));
  }
}