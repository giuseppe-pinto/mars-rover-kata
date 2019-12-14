package mover;

import domain.Direction;
import domain.Grid;
import domain.Rover;
import domain.State;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class LeftCommandTest
{
  private Grid grid;
  private State initialState;
  private final LeftCommand leftCommand = new LeftCommand();

  @Before
  public void setUp()
  {
    Integer col = 5;
    Integer row = 5;
    Direction direction = Direction.NORTH;

    initialState = new State(row, col, direction);

    grid = new Grid(10, 10);
  }

  @Test
  public void execute()
  {
    Rover rover = new Rover(grid, initialState);
    leftCommand.execute(rover);
    State expState = new State(5, 4 , Direction.WEST);
    Assert.assertThat(rover.getState(), is(expState));
  }

  @Test
  public void switchEdge()
  {
    Rover rover = new Rover(grid, new State(2, 0, Direction.SOUTH));
    leftCommand.execute(rover);
    State expState = new State(2, 9, Direction.WEST);
    System.out.println(rover.getGrid().toString());
    Assert.assertThat(rover.getState(), is(expState));
  }
}