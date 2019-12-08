package mover;

import domain.Direction;
import domain.Rover;
import domain.State;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class ForwardMoverTest
{
  private State initialState;

  @Before
  public void setUp()
  {
    Double x = (double) 5;
    Double y = (double) 5;
    Direction direction = Direction.WEST;

    initialState = new State(x,y, direction);
  }

  @Test
  public void move()
  {
    Rover rover = new Rover(initialState);
    ForwardCommand mover = new ForwardCommand(rover);
    mover.execute();
    State expState = new State((double) 5 , (double) 6, Direction.NORTH);

    Assert.assertThat(rover.getState(), is(expState));
  }
}