package mover;

import domain.Direction;
import domain.Rover;
import domain.State;

public class ForwardCommand implements MoverCommand
{

  @Override
  public void execute(Rover rover)
  {
    int[][] matrix = rover.getGrid().getMatrix();
    State actualState = rover.getState();

    try
    {
      matrix[actualState.getRow() - 1][actualState.getCol()] = 1;
      rover.setState(
        new State(
          rover.getState().getRow() - 1, rover.getState().getCol(),
          Direction.NORTH));
    }
    catch (IndexOutOfBoundsException e)
    {
      matrix[rover.getGrid().getRows() - 1][actualState.getCol()] = 1;

      rover.setState(
        new State(rover.getGrid().getRows() - 1,
          actualState.getCol(),
          Direction.NORTH));
    }
  }
}