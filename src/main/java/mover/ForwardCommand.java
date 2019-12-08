package mover;

import domain.Direction;
import domain.Rover;
import domain.State;

public class ForwardCommand implements MoverCommand
{

  @Override
  public void execute(Rover rover)
  {
    rover.setState(
      new State(
        rover.getState().getX(),
        rover.getState().getY() + 1,
        Direction.NORTH));
  }
}