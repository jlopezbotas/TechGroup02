/**
 * This class represents a Rectangle shape.
 *
 * @author Franco Aldunate
 * @version 16/11/2019
 */
public class Rectangle implements Shape {
    private int width;
    private int height;

    /**
     * Constructor {@link Rectangle} initializes values.
     *
     * @param width  of Rectangle.
     * @param height of Rectangle.
     */
    public Rectangle(final int width, final int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Draws shape given a character.
     *
     * @param character to use for drawing shape.
     */
    public void draw(final char character) {
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                System.out.print(String.format("%s ", character));
            }
            System.out.println();
        }
    }
}
