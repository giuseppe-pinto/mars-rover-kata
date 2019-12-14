package mover;

import domain.Direction;
import domain.Rover;
import domain.State;

public class RightCommand implements MoverCommand
{

  @Override
  public void execute(Rover rover)
  {
    rover.setState(
      new State(
        rover.getState().getRow(), rover.getState().getCol() + 1,
        Direction.EAST));
  }
}
