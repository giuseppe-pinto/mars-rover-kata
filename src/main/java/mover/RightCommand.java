package mover;

import domain.Direction;
import domain.Rover;
import domain.State;

public class RightCommand implements MoverCommand
{
  private Rover rover;

  public RightCommand(Rover rover)
  {
    this.rover = rover;
  }

  @Override
  public void execute()
  {
    rover.setState(new State(rover.getState().getX() + 1,
      rover.getState().getY(),
      Direction.EAST));
  }
}
