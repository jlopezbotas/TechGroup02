/**
 * This class represents a Triangle shape.
 *
 * @author Franco Aldunate
 * @version 16/11/2019
 */
public class Triangle implements Shape {
    private int height;

    /**
     * Constructor {@link Triangle} initializes values.
     *
     * @param height of Rectangle.
     */
    public Triangle(final int height) {
        this.height = height;
    }

    /**
     * Draws shape given a character.
     *
     * @param character to use for drawing shape.
     */
    public void draw(final char character) {
        for (int i = 0; i < this.height; i++) {
            int charQuantity = 1 + 2 * (i);
            int space = this.height - i;
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < charQuantity; k++) {
                System.out.print(String.format("%s ", character));
            }
            System.out.println();
        }
    }
}
