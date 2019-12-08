import domain.Rover;
import mover.MoverCommand;

import java.util.List;

class Mover
{
  private List<MoverCommand> moverCommands;

  void setMoverCommands(List<MoverCommand> moverCommands)
  {
    this.moverCommands = moverCommands;
  }

  void move(Rover rover)
  {
    if(checkInitialState(rover)){
      moverCommands.forEach(moverCommand -> moverCommand.execute(rover));
    }
    else {
      throw new MoverException("Wrong initial state, movement is not possible.");
    }
  }

  private boolean checkInitialState(Rover rover)
  {
    return rover.getState().getCol() <= rover.getGrid().getCols() &&
      rover.getState().getRow() <= rover.getGrid().getRows();
  }

  private static class MoverException extends RuntimeException
  {
    MoverException(String message)
    {
      super(message);
    }
  }
}