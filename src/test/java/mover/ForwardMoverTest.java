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
    Direction direction = new Direction("N");

    initialState = new State(x,y, direction);
  }

  @Test
  public void move()
  {
    Rover rover = new Rover(initialState);
    ForwardMover mover = new ForwardMover(rover);
    mover.move();
    State expState = new State((double) 6 , (double) 5, new Direction("N"));

    Assert.assertThat(rover.getState(), is(expState));
  }
}