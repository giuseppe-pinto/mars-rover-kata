import domain.Direction;
import domain.Rover;
import domain.State;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MoverTest
{
  private State initialState;

  @Before
  public void setUp()
  {
    Double x = (double) 5;
    Double y = (double) 5;
    Direction direction = Direction.NORTH;

    initialState = new State(x,y, direction);
  }

  @Test
  public void moveForward()
  {
    char[] commands = {'f'};
    Rover rover = new Rover(initialState);

    Mover mover = new Mover(rover, commands);
    mover.move();

    State expectedState = new State((double) 6, (double) 5, Direction.NORTH);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveForwardTwice()
  {
    char[] commands = {'f', 'f'};
    Rover rover = new Rover(initialState);

    Mover mover = new Mover(rover, commands);
    mover.move();

    State expectedState = new State((double) 7, (double) 5, Direction.NORTH);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveBackward()
  {
    char[] commands = {'b'};
    Rover rover = new Rover(initialState);

    Mover mover = new Mover(rover, commands);
    mover.move();

    State expectedState = new State((double) 4, (double) 5, Direction.NORTH);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveBackwardTwice()
  {
    char[] commands = {'b', 'b'};
    Rover rover = new Rover(initialState);

    Mover mover = new Mover(rover, commands);
    mover.move();

    State expectedState = new State((double) 3, (double) 5, Direction.NORTH);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveBackwardAndForward()
  {
    char[] commands = {'b', 'f'};
    Rover rover = new Rover(initialState);

    Mover mover = new Mover(rover, commands);
    mover.move();

    State expectedState = new State((double) 5, (double) 5, Direction.NORTH);
    assertThat(rover.getState(), is(expectedState));
  }
}