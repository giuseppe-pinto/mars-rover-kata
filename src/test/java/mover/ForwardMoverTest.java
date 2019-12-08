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
  private State initialState;

  @Before
  public void setUp()
  {
    Integer x = 5;
    Integer y = 5;
    Direction direction = Direction.WEST;

    initialState = new State(x,y, direction);
  }

  @Test
  public void move()
  {
    Rover rover = new Rover(new Grid(15,15), initialState);
    ForwardCommand mover = new ForwardCommand();
    mover.execute(rover);
    State expState = new State(5 , 4, Direction.NORTH);

    Assert.assertThat(rover.getState(), is(expState));
  }
}