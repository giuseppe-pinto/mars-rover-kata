package domain;

import java.util.Objects;

public class State
{
  private final Integer col;
  private final Integer row;
  private final Direction direction;

  public State(Integer row, Integer col, Direction direction)
  {
    this.col = col;
    this.row = row;
    this.direction = direction;
  }

  public Integer getCol()
  {
    return col;
  }

  public Integer getRow()
  {
    return row;
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
    return Objects.equals(col, state.col) &&
      Objects.equals(row, state.row) &&
      Objects.equals(direction, state.direction);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(col, row, direction);
  }

  @Override
  public String toString()
  {
    return "State{" +
      "x=" + col +
      ", y=" + row +
      ", direction=" + direction +
      '}';
  }
}
