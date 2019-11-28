public class Triangle extends Shape {
    private final int height;

    public Triangle(final String printChar, final int height) {
        this.height = height;
        this.printChar = printChar;
    }
    @Override
    public String print() {
        final StringBuilder string = new StringBuilder();
        int c = 1;
        for (int i = 1; i <= this.height; i++) {
            final StringBuilder spaces = new StringBuilder();
            final StringBuilder chain = new StringBuilder();
            for (int k = 0; k < (this.height - i); k++) {
                spaces.append(" ");
            }
            for (int j = 0; j < c; j++) {
                chain.append(this.printChar);
            }
            string.append(spaces);
            string.append(chain);
            string.append("\n");
            c += 2;
        }
        return string.toString();
    }
}
