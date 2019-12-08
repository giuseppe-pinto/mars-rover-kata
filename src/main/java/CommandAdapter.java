import domain.Rover;
import mover.BackwardCommand;
import mover.ForwardCommand;
import mover.LeftCommand;
import mover.MoverCommand;
import mover.RightCommand;

import java.util.ArrayList;
import java.util.List;

import static domain.Command.BACKWARD;
import static domain.Command.FORWARD;
import static domain.Command.LEFT;
import static domain.Command.RIGHT;

public class CommandAdapter
{

  private char[] commands;

  public CommandAdapter(char[] commands)
  {
    this.commands = commands;
  }

  public List<MoverCommand> adapt()
  {
    ArrayList<MoverCommand> moverCommands = new ArrayList<>();

    for (char c : commands)
    {
      if (FORWARD.getValue() == c)
      {
        moverCommands.add(new ForwardCommand());
      }
      else if (BACKWARD.getValue() == c)
      {
        moverCommands.add(new BackwardCommand());
      }
      else if (LEFT.getValue() == c)
      {
        moverCommands.add(new LeftCommand());
      }
      else if (RIGHT.getValue() == c)
      {
        moverCommands.add(new RightCommand());
      }
    }
    return moverCommands;
  }

}
