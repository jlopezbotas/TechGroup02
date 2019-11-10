package whackamole;

import java.util.Scanner;

public class WhackAMole {
  int score = 0;
  int molesLeft;
  int attemptsleft;
  char[][] moleGrid;

  /**
   * @param numAttempts
   * @param gridDimension
   * @param numMoles
   */
  public WhackAMole(final int numAttempts, final int gridDimension, int numMoles) {
    this.molesLeft = numMoles;
    this.attemptsleft = numAttempts;
    this.moleGrid = new char[gridDimension][gridDimension];
    for (int i = 0; i < gridDimension; i++) {
      for (int j = 0; j < gridDimension; j++) {
        moleGrid[i][j] = '*';
      }
    }
    int x, y;
    while (numMoles > 0) {
      x = (int) (Math.random() * 9 + 1);
      y = (int) (Math.random() * 9 + 1);
      if (place(x, y)) {
        numMoles -= 1;
      }
    }

  }

  public static void main(final String[] args) {
    final WhackAMole whackAMole = new WhackAMole(10, 10, 10);
    int x;
    int y;
//        whackAMole.printGrid();
//        System.out.println("----------------");
//        whackAMole.printGridToUser();

    while (whackAMole.attemptsleft > 0) {
      final Scanner scanner = new Scanner(System.in);
      System.out.print("Enter x: ");
      x = scanner.nextInt() - 1;
      System.out.print("Enter y: ");
      y = scanner.nextInt() - 1;
      if (x == -2 && y == -2) {
        System.out.println("YOU GIVED UP!!!!");
        whackAMole.printGridToUser();
        whackAMole.attemptsleft = 0;
      } else {
        whackAMole.whack(x, y);
        whackAMole.printGridToUser();
      }
    }

    if (whackAMole.molesLeft == 0) {
      System.out.println("YOU WIN!!!!!");
    } else {
      System.out.println("YOU LOSE!!!!!");
    }
    whackAMole.printGrid();
  }

  boolean place(final int x, final int y) {
    if (moleGrid[x][y] != 'M') {
      moleGrid[x][y] = 'M';
      // this.molesLeft -= 1;
      return true;
    } else {
      return false;
    }
  }

  void whack(final int x, final int y) {
    if (moleGrid[x][y] == 'M') {
      moleGrid[x][y] = 'W';
      this.molesLeft -= 1;
      this.score += 1;
    }
    this.attemptsleft -= 1;
  }

  void printGridToUser() {
    System.out.println("Score: " + this.score);
    System.out.println("attempst left: " + this.attemptsleft);
    for (int i = 0; i < moleGrid.length; i++) {
      System.out.print("| ");
      for (int j = 0; j < moleGrid.length; j++) {
        if (moleGrid[i][j] == 'M') {
          System.out.print("*" + " | ");
        } else {
          System.out.print(moleGrid[i][j] + " | ");
        }
      }
      System.out.println("");
    }
  }

  void printGrid() {
    System.out.println("Score: " + this.score);
    System.out.println("attempst left: " + this.attemptsleft);
    for (int i = 0; i < moleGrid.length; i++) {
      System.out.print("| ");
      for (int j = 0; j < moleGrid.length; j++) {
        System.out.print(moleGrid[i][j] + " | ");
      }
      System.out.println("");
    }
  }

}
