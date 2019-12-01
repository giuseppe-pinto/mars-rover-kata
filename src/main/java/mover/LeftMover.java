package mover;

import domain.Rover;
import domain.State;

public class LeftMover implements MoverStrategy
{
  private Rover rover;

  LeftMover(Rover rover)
  {
    this.rover = rover;
  }

  @Override
  public void move()
  {
    rover.setState(
      new State(
        rover.getState().getX(),
        rover.getState().getY() - 1,
        rover.getState().getDirection()));
  }
}