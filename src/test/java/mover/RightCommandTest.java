package mover;

import domain.Direction;
import domain.Grid;
import domain.Rover;
import domain.State;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RightCommandTest
{
  private State initialState;
  private Grid grid;
  private final RightCommand command = new RightCommand();

  @Before
  public void setUp()
  {
    initialState = new State(5, 5, Direction.NORTH);
    grid = new Grid(10,7);
  }

  @Test
  public void execute()
  {
    Rover rover = new Rover(grid, initialState);
    command.execute(rover);
    State expState = new State(5, 6, Direction.EAST);
    assertThat(rover.getState(), is(expState));
  }

  @Test
  public void switchEdge()
  {
    Rover rover = new Rover(grid, new State(2,6, Direction.SOUTH));
    command.execute(rover);
    State expState = new State(2,0, Direction.EAST);
    System.out.println(rover.getGrid().toString());
    Assert.assertThat(rover.getState(), is(expState));
  }
}