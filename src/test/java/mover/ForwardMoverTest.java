package mover;

import domain.Direction;
import domain.Grid;
import domain.Rover;
import domain.State;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class ForwardMoverTest
{
  private static final Grid GRID = new Grid(15, 15);
  private State initialState;
  private final ForwardCommand forwardCommand = new ForwardCommand();

  @Before
  public void setUp()
  {
    Integer col = 5;
    Integer row = 5;
    Direction direction = Direction.WEST;

    initialState = new State(col,row, direction);
  }

  @Test
  public void move()
  {
    Rover rover = new Rover(GRID, initialState);
    forwardCommand.execute(rover);
    State expState = new State(5 , 4, Direction.NORTH);

    Assert.assertThat(rover.getState(), is(expState));
  }

  @Test
  public void switchEdgeFromNorthToSud()
  {
    Rover rover = new Rover(GRID, new State(0, 0, Direction.EAST));
    forwardCommand.execute(rover);
    State expState = new State(0, 14, Direction.NORTH);
    System.out.println(rover.getGrid().toString());
    Assert.assertThat(rover.getState(), is(expState));
  }
}