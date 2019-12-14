package mover;

import domain.Direction;
import domain.Rover;
import domain.State;

public class LeftCommand implements MoverCommand
{

  @Override
  public void execute(Rover rover)
  {
    State actualState = rover.getState();
    int[][] matrix = rover.getGrid().getMatrix();

    try
    {
      matrix[actualState.getRow()][actualState.getCol() - 1] = 1;

      rover.setState(
        new State(
          actualState.getRow(), actualState.getCol() - 1,
          Direction.WEST));


    }
    catch (IndexOutOfBoundsException e)
    {
      matrix[actualState.getRow()][rover.getGrid().getCols() - 1] = 1;

      rover.setState(
        new State(
          actualState.getRow(),
          rover.getGrid().getCols() - 1,
          Direction.WEST));
    }
  }
}