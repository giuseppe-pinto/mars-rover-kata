import mover.MoverCommand;

import java.util.List;

class Mover
{
  private List<MoverCommand> moverCommands;

  void setMoverCommands(List<MoverCommand> moverCommands)
  {
    this.moverCommands = moverCommands;
  }
  void move()
  {
    moverCommands.forEach(MoverCommand::execute);
  }
}