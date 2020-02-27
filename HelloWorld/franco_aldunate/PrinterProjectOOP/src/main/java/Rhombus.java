/**
 * This class represents a Rhombus shape.
 *
 * @author Franco Aldunate
 * @version 16/11/2019
 */
public class Rhombus implements Shape {
    private int height;
    private char character;

    /**
     * Constructor {@link Rhombus} initializes values.
     *
     * @param character to use for drawing Rhombus.
     */
    public Rhombus(final char character) {
        this.character = character;
    }

    /**
     * Sets Rhombus height.
     *
     * @param height of Rhombus.
     * @return whether Rhombus height was set or not.
     */
    public boolean setHeight(final int height) {
        if (height % 2 != 0) {
            this.height = height;
            return true;
        }
        return false;
    }

    /**
     * Draws shape.
     */
    public void draw() {
        for (int i = 0; i < this.height / 2; i++) {
            int charQuantity = 1 + 2 * (i);
            int space = this.height / 2 - i + 1;
            for (int j = 0; j < space; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < charQuantity; k++) {
                System.out.print(String.format("%s ", this.character));
            }
            System.out.println();
        }
        for (int i = this.height / 2; i > -1; i--) {
            int charQuantity = 1 + 2 * (i);
            int space = this.height / 2 - i + 1;
            for (int j = space; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = charQuantity; k > 0; k--) {
                System.out.print(String.format("%s ", this.character));
            }
            System.out.println();
        }
    }
}
