package mover;

import domain.Rover;
import domain.State;

import static domain.Direction.EAST;

public class RightCommand implements MoverCommand
{

  @Override
  public void execute(Rover rover)
  {
    int[][] matrix = rover.getGrid().getMatrix();
    State actualState = rover.getState();

    try
    {
      matrix[actualState.getRow()][actualState.getCol() + 1] = 1;

      rover.setState(
        new State(
          actualState.getRow(), actualState.getCol() + 1,
          EAST));
    }
    catch (IndexOutOfBoundsException e)
    {
      matrix[actualState.getRow()][0] = 1;

      rover.setState(
        new State(
          actualState.getRow(),
          0,
          EAST));
    }
  }
}
