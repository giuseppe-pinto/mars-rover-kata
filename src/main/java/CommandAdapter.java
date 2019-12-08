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
  private Rover rover;
  private char[] commands;

  public CommandAdapter(Rover rover, char[] commands)
  {
    this.rover = rover;
    this.commands = commands;
  }

  public List<MoverCommand> adapt(){

    ArrayList<MoverCommand> moverCommands = new ArrayList<>();

    for (char c : commands)
    {
      if (FORWARD.getValue() == c)
      {
        moverCommands.add(new ForwardCommand(rover));
    }
      else if (BACKWARD.getValue() == c)
      {
        moverCommands.add(new BackwardCommand(rover));
      }
      else if(LEFT.getValue() == c)
      {
        moverCommands.add(new LeftCommand(rover));
      }
      else if(RIGHT.getValue() == c)
      {
        moverCommands.add(new RightCommand(rover));
      }
    }
    return moverCommands;
  }

}
