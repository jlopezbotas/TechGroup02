/**
 * This class represents a Triangle shape.
 *
 * @author Franco Aldunate
 * @version 16/11/2019
 */
public class Triangle implements Shape {
    private int height;
    private char character;

    /**
     * Constructor {@link Triangle} initializes values.
     *
     * @param height    of Triangle.
     * @param character to use for drawing Triangle.
     */
    public Triangle(final int height, final char character) {
        this.height = height;
        this.character = character;
    }

    /**
     * Draws shape.
     */
    public void draw() {
        for (int i = 0; i < this.height; i++) {
            int charQuantity = 1 + 2 * (i);
            int space = this.height - i;
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < charQuantity; k++) {
                System.out.print(String.format("%s ", this.character));
            }
            System.out.println();
        }
    }
}
