package mover;

import domain.Direction;
import domain.Rover;
import domain.State;

public class LeftCommand implements MoverCommand
{

  @Override
  public void execute(Rover rover)
  {
    rover.setState(
      new State(
        rover.getState().getX() - 1,
        rover.getState().getY(),
        Direction.WEST));
  }
}