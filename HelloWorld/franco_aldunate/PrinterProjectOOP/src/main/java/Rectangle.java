/**
 * This class represents a Rectangle shape.
 *
 * @author Franco Aldunate
 * @version 16/11/2019
 */
public class Rectangle implements Shape {
    private int width;
    private int height;
    private char character;

    /**
     * Constructor {@link Rectangle} initializes values.
     *
     * @param width     of Rectangle.
     * @param height    of Rectangle.
     * @param character to use for drawing Rectangle.
     */
    public Rectangle(final int width, final int height, final char character) {
        this.width = width;
        this.height = height;
        this.character = character;
    }

    /**
     * Draws shape.
     */
    public void draw() {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(String.format("%s ", this.character));
            }
            System.out.println();
        }
    }
}
