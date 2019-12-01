package domain;

public enum Command
{
  FORWARD('f'),
  BACKWARD('b'),
  LEFT('l'),
  RIGHT('r');

  private char value;

  Command(char value)
  {
    this.value = value;
  }

  public char getValue()
  {
    return value;
  }
}
