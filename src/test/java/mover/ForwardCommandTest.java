package mover;

import domain.Direction;
import domain.Grid;
import domain.Rover;
import domain.State;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class ForwardCommandTest
{
  private final ForwardCommand forwardCommand = new ForwardCommand();
  private State initialState;
  private Grid grid;

  @Before
  public void setUp()
  {
    Integer col = 5;
    Integer row = 5;
    Direction direction = Direction.WEST;
    initialState = new State(row, col, direction);

    grid = new Grid(8, 7);
  }

  @Test
  public void execute()
  {
    Rover rover = new Rover(grid, initialState);
    forwardCommand.execute(rover);
    State expState = new State(4, 5 , Direction.NORTH);
    System.out.println(rover.getGrid().toString());
    Assert.assertThat(rover.getState(), is(expState));
  }

  @Test
  public void switchEdgeFromNorthToSudInZeroZero()
  {
    Rover rover = new Rover(grid, new State(0, 0, Direction.EAST));
    forwardCommand.execute(rover);
    State expState = new State(7, 0, Direction.NORTH);
    System.out.println(rover.getGrid().toString());
    Assert.assertThat(rover.getState(), is(expState));
  }

  @Test
  public void switchEdgeFromNorthToSudInOneZero()
  {
    Rover rover = new Rover(grid, new State(0, 1, Direction.EAST));
    forwardCommand.execute(rover);
    State expState = new State(7, 1, Direction.NORTH);
    System.out.println(rover.getGrid().toString());
    Assert.assertThat(rover.getState(), is(expState));
  }
}