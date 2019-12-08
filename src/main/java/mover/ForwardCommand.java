package mover;

import domain.Direction;
import domain.Rover;
import domain.State;

public class ForwardCommand implements MoverCommand
{
  private Rover rover;

  public ForwardCommand(Rover rover)
  {
    this.rover = rover;
  }

  @Override
  public void execute()
  {
    rover.setState(
      new State(
        rover.getState().getX(),
        rover.getState().getY() + 1,
        Direction.NORTH));
  }
}