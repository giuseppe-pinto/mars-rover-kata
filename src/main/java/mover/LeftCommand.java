package mover;

import domain.Direction;
import domain.Rover;
import domain.State;

public class LeftCommand implements MoverCommand
{
  private Rover rover;

  public LeftCommand(Rover rover)
  {
    this.rover = rover;
  }

  @Override
  public void execute()
  {
    rover.setState(
      new State(
        rover.getState().getX() - 1,
        rover.getState().getY(),
        Direction.WEST));
  }
}