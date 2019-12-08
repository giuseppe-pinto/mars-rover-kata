package mover;

import domain.Direction;
import domain.Rover;
import domain.State;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RightMoverTest
{
  private State initialState;

  @Before
  public void setUp()
  {
    Double x = (double) 5;
    Double y = (double) 5;
    Direction direction = Direction.NORTH;

    initialState = new State(x,y, direction);
  }

  @Test
  public void move()
  {
    Rover rover = new Rover(initialState);
    RightCommand mover = new RightCommand();
    mover.execute(rover);
    State expState = new State((double) 6, (double) 5, Direction.EAST);

    assertThat(rover.getState(), is(expState));
  }

}