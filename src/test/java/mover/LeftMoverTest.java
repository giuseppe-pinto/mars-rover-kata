package mover;

import domain.Direction;
import domain.Rover;
import domain.State;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class LeftMoverTest
{
  private State initialState;

  @Before
  public void setUp()
  {
    Integer col = 5;
    Integer row = 5;
    Direction direction = Direction.NORTH;

    initialState = new State(col,row, direction);
  }

  @Test
  public void move()
  {
    Rover rover = new Rover(null, initialState);
    LeftCommand mover = new LeftCommand();
    mover.execute(rover);
    State expState = new State(4 , 5, Direction.WEST);

    Assert.assertThat(rover.getState(), is(expState));
  }

}