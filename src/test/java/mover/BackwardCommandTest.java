package mover;

import domain.Direction;
import domain.Grid;
import domain.Rover;
import domain.State;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class BackwardCommandTest
{
  private final BackwardCommand backwardCommand = new BackwardCommand();
  private State initialState;
  private Grid grid;

  @Before
  public void setUp()
  {
    Integer col = 2;
    Integer row = 2;
    Direction direction = Direction.NORTH;

    initialState = new State(row, col, direction);

    grid = new Grid(10, 10);
  }

  @Test
  public void execute()
  {
    Rover rover = new Rover(grid, initialState);

    backwardCommand.execute(rover);
    
    State expState = new State(3, 2 , Direction.SOUTH);
    System.out.println(rover.getGrid().toString());
    Assert.assertThat(rover.getState(), is(expState));
  }

  @Test
  public void switchEdgeFromSudToNorth()
  {
    State downBorderState = new State(9, 3, Direction.SOUTH);

    Rover rover = new Rover(grid, downBorderState);
    backwardCommand.execute(rover);

    State expState = new State(0, 3 , Direction.SOUTH);
    System.out.println(rover.getGrid().toString());
    Assert.assertThat(rover.getState(), is(expState));
  }
}