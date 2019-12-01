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
    Direction direction = new Direction("N");

    initialState = new State(x,y, direction);
  }

  @Test
  public void createRover()
  {
    char[] commands = {};
    Rover rover = new Rover(initialState, commands);
    assertThat(rover.getState().getX(), is((double) 0L));
    assertThat(rover.getState().getY(), is((double) 0L));
    assertThat(rover.getState().getDirection(), is(new Direction("N")));
  }

  @Test
  public void roverReceiveCommands()
  {
    char[] commands = {'l', 'l', 'r'};
    Rover rover = new Rover(initialState, commands);
    assertThat(rover.getCommands(), is(new char[] {'l', 'l', 'r'}));
  }
}