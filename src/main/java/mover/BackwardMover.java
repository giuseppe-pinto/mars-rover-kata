package mover;

import domain.Rover;
import domain.State;

public class BackwardMover implements MoverStrategy
{
  private Rover rover;

  public BackwardMover(Rover rover)
  {
    this.rover = rover;
  }

  @Override
  public void move()
  {
    rover.setState(
      new State(
        rover.getState().getX() - 1,
        rover.getState().getY(),
        rover.getState().getDirection()));
  }
}
