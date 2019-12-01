package mover;

import domain.Rover;
import domain.State;

public class ForwardMover implements Mover
{
  private Rover rover;

  public ForwardMover(Rover rover)
  {
    this.rover = rover;
  }

  @Override
  public void move()
  {
    rover.setState(
      new State(
        rover.getState().getX() + 1,
        rover.getState().getY(),
        rover.getState().getDirection()));
  }
}
