package mover;

import domain.Rover;
import domain.State;

public class LeftMover implements MoverStrategy
{
  private Rover rover;

  public LeftMover(Rover rover)
  {
    this.rover = rover;
  }

  @Override
  public void move()
  {
    State initialState = rover.getState();
    rover.setState(new State(initialState.getX(), initialState.getY() - 1, initialState.getDirection()));
  }
}
