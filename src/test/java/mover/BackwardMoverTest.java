package mover;

import domain.Direction;
import domain.Rover;
import domain.State;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class BackwardMoverTest
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
    BackwardCommand mover = new BackwardCommand();
    mover.execute(rover);
    State expState = new State((double) 5 , (double) 4, Direction.SOUTH);

    Assert.assertThat(rover.getState(), is(expState));
  }

}