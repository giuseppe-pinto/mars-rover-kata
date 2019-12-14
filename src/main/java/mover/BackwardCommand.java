package mover;

import domain.Direction;
import domain.Rover;
import domain.State;

public class BackwardCommand implements MoverCommand
{

  @Override
  public void execute(Rover rover)
  {

    int[][] matrix = rover.getGrid().getMatrix();
    State actualState = rover.getState();

    try{

      matrix[actualState.getRow()+1][actualState.getCol()] = 1;
      rover.setState(
        new State(
          actualState.getRow()+1, actualState.getCol(),
          Direction.SOUTH));

    }catch (IndexOutOfBoundsException e){

      matrix[0][actualState.getCol()] = 1;
      rover.setState(
        new State(
          0, actualState.getCol(),
          Direction.SOUTH));

    }

  }
}
