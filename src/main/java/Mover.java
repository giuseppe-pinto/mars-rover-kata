import domain.Rover;
import mover.BackwardMover;
import mover.ForwardMover;

import static domain.Command.BACKWARD;
import static domain.Command.FORWARD;

public class Mover
{
  private Rover rover;
  private char[] commands;

  public Mover(Rover rover, char[] commands)
  {
    this.rover = rover;
    this.commands = commands;
  }

  public void move()
  {

    for (char c : commands)
    {
      if (FORWARD.getValue() == c)
      {
        new ForwardMover(rover).move();
      }
      else if (BACKWARD.getValue() == c)
      {
        new BackwardMover(rover).move();
      }
    }
  }


}