package domain;

public class Rover
{
  private State state;
  private Grid grid;

  public Rover(Grid grid, State state)
  {
    this.grid = grid;
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

  public Grid getGrid()
  {
    return grid;
  }
}
