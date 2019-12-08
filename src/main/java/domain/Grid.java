package domain;

import java.util.Arrays;

public class Grid
{
  private int rows;
  private int cols;
  private final int [][] matrix;

  public Grid(int rows, int cols)
  {
    this.rows = rows;
    this.cols = cols;
    matrix = new int[rows][cols];
  }

  public int[][] getMatrix()
  {
    return matrix;
  }

  public int getRows()
  {
    return rows;
  }

  public int getCols()
  {
    return cols;
  }

  @Override
  public String toString()
  {
    StringBuilder matrixString = new StringBuilder();

    for (int[] row : matrix)
      matrixString.append(Arrays.toString(row)).append("\n");

    return matrixString.toString();
  }
}
