package mover;

import domain.Rover;

public interface MoverCommand
{
  void execute(Rover rover);
}
