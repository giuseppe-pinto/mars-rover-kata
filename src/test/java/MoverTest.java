import domain.Direction;
import domain.Rover;
import domain.State;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MoverTest
{
  private Rover rover;

  @Before
  public void setUp()
  {
    Double x = (double) 5;
    Double y = (double) 5;
    Direction direction = Direction.NORTH;
    State initialState = new State(x, y, direction);
    rover = new Rover(initialState);
  }

  @Test
  public void moveForward()
  {
    char[] commands = {'f'};

    Mover mover = new Mover(rover, commands);
    mover.move();

    State expectedState = new State((double) 5, (double) 6, Direction.NORTH);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveForwardTwice()
  {
    char[] commands = {'f', 'f'};

    Mover mover = new Mover(rover, commands);
    mover.move();

    State expectedState = new State((double) 5, (double) 7, Direction.NORTH);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveBackward()
  {
    char[] commands = {'b'};

    Mover mover = new Mover(rover, commands);
    mover.move();

    State expectedState = new State((double) 5, (double) 4, Direction.SOUTH);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveBackwardTwice()
  {
    char[] commands = {'b', 'b'};

    Mover mover = new Mover(rover, commands);
    mover.move();

    State expectedState = new State((double) 5, (double) 3, Direction.SOUTH);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveBackwardAndForward()
  {
    char[] commands = {'b', 'f'};

    Mover mover = new Mover(rover, commands);
    mover.move();

    State expectedState = new State((double) 5, (double) 5, Direction.NORTH);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveLeft()
  {
    char[] commands = {'l'};

    Mover mover = new Mover(rover, commands);
    mover.move();

    State expectedState = new State((double) 4, (double) 5, Direction.WEST);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveRight()
  {
    char[] commands = {'r'};

    Mover mover = new Mover(rover, commands);
    mover.move();

    State expectedState = new State((double) 6, (double) 5, Direction.EAST);
    assertThat(rover.getState(), is(expectedState));
  }
}