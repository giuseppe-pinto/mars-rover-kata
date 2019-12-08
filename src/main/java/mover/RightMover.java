package mover;

import domain.Direction;
import domain.Rover;
import domain.State;

public class RightMover implements MoverStrategy
{
  private Rover rover;

  public RightMover(Rover rover)
  {
    this.rover = rover;
  }

  @Override
  public void move()
  {
    rover.setState(new State(rover.getState().getX() + 1,
      rover.getState().getY(),
      Direction.EAST));
  }
}
