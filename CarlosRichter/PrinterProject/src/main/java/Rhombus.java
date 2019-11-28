public class Rhombus extends Shape {
  private final int height;

  public Rhombus(final String printChar, final int height) {
    this.height = height;
    this.printChar = printChar;
  }
  @Override
  public String print() {
    final StringBuilder string = new StringBuilder();
    int c = 1;
    int spacesinit=0;
    for (int i = 1; i <= this.height/2+1; i++) {
      final StringBuilder spaces = new StringBuilder();
      final StringBuilder chain = new StringBuilder();
      for (int k = 0; k <= (this.height/2 - i); k++) {
        spaces.append(" ");
      }
      for (int j = 0; j < c; j++) {
        chain.append(this.printChar);
      }
      string.append(spaces);
      string.append(chain);
      string.append("\n");
      spacesinit = spaces.length();
      c += 2;
    }

    int c2 =c-4 ;
    int c3=1;
    for (int i = this.height/2; i >0; i--) {
      final StringBuilder spaces = new StringBuilder();
      final StringBuilder chain = new StringBuilder();
      for (int k = 0; k < c3; k++) {
        spaces.append(" ");
      }
      for (int j = 0; j < c2; j++) {
        chain.append(this.printChar);
      }
      string.append(spaces);
      string.append(chain);
      string.append("\n");
      c2 -= 2;
      c3++;
    }


    return string.toString();
  }
}
