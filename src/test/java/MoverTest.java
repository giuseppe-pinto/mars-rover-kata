import adapters.CommandAdapter;
import domain.Direction;
import domain.Grid;
import domain.Rover;
import domain.State;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MoverTest
{
  private Rover rover;
  private Mover mover;

  @Before
  public void setUp()
  {
    Grid grid = new Grid(10, 10);

    Integer col = 5;
    Integer row = 5;
    Direction direction = Direction.NORTH;

    State initialState = new State(col, row, direction);

    rover = new Rover(grid, initialState);
    mover = new Mover();
  }

  @Test
  public void moveForward()
  {
    char[] commands = {'f'};

    mover.setMoverCommands(new CommandAdapter(commands).adapt());
    mover.move(rover);

    State expectedState = new State(5, 4, Direction.NORTH);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveForwardTwice()
  {
    char[] commands = {'f', 'f'};

    mover.setMoverCommands(new CommandAdapter(commands).adapt());
    mover.move(rover);

    State expectedState = new State(5, 3, Direction.NORTH);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveBackward()
  {
    char[] commands = {'b'};

    mover.setMoverCommands(new CommandAdapter(commands).adapt());
    mover.move(rover);

    State expectedState = new State(5, 6, Direction.SOUTH);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveBackwardTwice()
  {
    char[] commands = {'b', 'b'};

    mover.setMoverCommands(new CommandAdapter(commands).adapt());
    mover.move(rover);

    State expectedState = new State(5, 7, Direction.SOUTH);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveBackwardAndForward()
  {
    char[] commands = {'b', 'f'};

    mover.setMoverCommands(new CommandAdapter(commands).adapt());
    mover.move(rover);

    State expectedState = new State(5, 5, Direction.NORTH);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveLeft()
  {
    char[] commands = {'l'};

    mover.setMoverCommands(new CommandAdapter(commands).adapt());
    mover.move(rover);

    State expectedState = new State(4, 5, Direction.WEST);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test
  public void moveRight()
  {
    char[] commands = {'r'};

    mover.setMoverCommands(new CommandAdapter(commands).adapt());
    mover.move(rover);

    State expectedState = new State(6, 5, Direction.EAST);
    assertThat(rover.getState(), is(expectedState));
  }

  @Test(expected = RuntimeException.class)
  public void wrongInitialState()
  {
    State wrongState = new State(3, 3, Direction.SOUTH);
    Rover rover = new Rover(new Grid(3,3), wrongState);
    mover.move(rover);
  }
}