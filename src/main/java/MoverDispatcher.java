import domain.Rover;
import mover.BackwardMover;
import mover.ForwardMover;

public class MoverDispatcher
{
  private Rover rover;

  public MoverDispatcher(Rover rover)
  {
    this.rover = rover;
  }

  public void move()
  {
    ForwardMover forwardMover = new ForwardMover(rover);
    BackwardMover backwardMover = new BackwardMover(rover);

    char[] commands = rover.getCommands();

    for (char c : commands)
    {
      if ('f' == c)
      {
        forwardMover.move();
      }
      else if ('b' == c)
      {
        backwardMover.move();
      }
    }
  }


}
