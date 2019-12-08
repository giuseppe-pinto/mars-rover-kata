package mover;

import domain.Direction;
import domain.Grid;
import domain.Rover;
import domain.State;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class BackwardMoverTest
{

  private State initialState;
  private Grid grid;

  @Before
  public void setUp()
  {
    grid = new Grid(10,10);

    Integer x = 2;
    Integer y = 2;
    Direction direction = Direction.NORTH;

    initialState = new State(x,y, direction);
  }

  @Test
  public void move()
  {
    Rover rover = new Rover(grid, initialState);
    
    BackwardCommand mover = new BackwardCommand();
    mover.execute(rover);
    
    State expState = new State(2 , 3, Direction.SOUTH);
    System.out.println(rover.getGrid().toString());

    Assert.assertThat(rover.getState(), is(expState));
  }

  @Test
  public void switchEdgeFromSudToNorth()
  {
    State downBorderState = new State(3, 9, Direction.SOUTH);

    Rover rover = new Rover(grid, downBorderState);

    BackwardCommand mover = new BackwardCommand();
    mover.execute(rover);

    State expState = new State(3 , 0, Direction.SOUTH);
    System.out.println(rover.getGrid().toString());
    Assert.assertThat(rover.getState(), is(expState));
  }
}