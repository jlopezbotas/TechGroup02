public class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(final String printChar, final int width, final int height) {
        this.width = width;
        this.height = height;
        this.printChar = printChar;
    }

    @Override
    public String print() {
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                stringBuilder.append(this.printChar);
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
