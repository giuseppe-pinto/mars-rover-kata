import domain.Rover;
import mover.BackwardMover;
import mover.ForwardMover;

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
      if ('f' == c)
      {
        new ForwardMover(rover).move();
      }
      else if ('b' == c)
      {
        new BackwardMover(rover).move();
      }
    }
  }
}