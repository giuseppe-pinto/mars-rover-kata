package domain;

import java.util.Objects;

public class Direction
{
  private String n;

  public Direction(String n)
  {
    this.n = n;
  }

  public String getN()
  {
    return n;
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
    Direction direction = (Direction) o;
    return Objects.equals(n, direction.n);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(n);
  }

  @Override
  public String toString()
  {
    return "domain.Direction{" +
      "n='" + n + '\'' +
      '}';
  }
}
