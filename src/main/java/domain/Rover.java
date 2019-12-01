package domain;

public class Rover
{
  private State state;
  private char[] commands;

  public Rover(State state, char[] commands)
  {
    this.state = state;
    this.commands = commands;
  }

  public char[] getCommands()
  {
    return commands;
  }

  public State getState()
  {
    return state;
  }

  public void setState(State state)
  {
    this.state = state;
  }
}
