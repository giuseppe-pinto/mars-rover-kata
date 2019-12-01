package domain;

import java.util.Objects;

public class State
{
  private final Double x;
  private final Double y;
  private final Direction direction;
  public State(Double x, Double y, Direction direction)
  {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public Double getX()
  {
    return x;
  }

  public Double getY()
  {
    return y;
  }

  public Direction getDirection()
  {
    return direction;
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
    {
      return true;
    }
    if (o == null || getClass() != o.getClass())
    {
      return false;
    }
    State state = (State) o;
    return Objects.equals(x, state.x) &&
      Objects.equals(y, state.y) &&
      Objects.equals(direction, state.direction);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(x, y, direction);
  }

  @Override
  public String toString()
  {
    return "domain.State{" +
      "x=" + x +
      ", y=" + y +
      ", initialDirection=" + direction +
      '}';
  }

}
