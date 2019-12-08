import domain.Direction;
import domain.Grid;
import domain.Rover;
import domain.State;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverTest
{
  private Grid grid;
  private State initialState;

  @Before
  public void setUp()
  {
    grid = new Grid(5,5);

    Integer x = 0;
    Integer y = 0;
    Direction direction = Direction.NORTH;

    initialState = new State(x,y, direction);
  }

  @Test
  public void createRover()
  {
    Rover rover = new Rover(grid, initialState);
    assertThat(rover.getState().getCol(), is(0));
    assertThat(rover.getState().getRow(), is(0));
    assertThat(rover.getState().getDirection(), is(Direction.NORTH));
  }
}