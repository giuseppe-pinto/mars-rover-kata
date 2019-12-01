package domain;

public class Rover
{
  private State state;

  public Rover(State state)
  {
    this.state = state;
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
