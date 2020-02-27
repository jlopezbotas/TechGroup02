import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Shape Printer.
 *
 * @author Franco Aldunate
 * @version 16/11/2019
 */
public class Printer {
    private List<Shape> shapes;
    private String menu = "\nPrinter Project: Please select an option\n"
            .concat("1. Rectangle\n")
            .concat("2. Triangle\n")
            .concat("3. Rhombus\n")
            .concat("4. Print!\n")
            .concat("5. Exit\n");

    /**
     * Constructor {@link Printer} initializes values.
     */
    public Printer() {
        shapes = new ArrayList<Shape>();
        menu = "\nPrinter Project: Please select an option\n"
                .concat("1. Rectangle\n")
                .concat("2. Triangle\n")
                .concat("3. Rhombus\n")
                .concat("4. Print!\n")
                .concat("5. Exit\n");
    }

    /**
     * Adds a shep to Printer list.
     *
     * @param shape is a Shape type object.
     */
    public void addShape(final Shape shape) {
        this.shapes.add(shape);
    }

    /**
     * Prints the Printer menu.
     */
    public void printMenu() {
        System.out.println(this.menu);
    }

    /**
     * Prints all elements on Printer shape list.
     */
    public void printShapes() {
        System.out.println("Printing Shapes...");
        if (shapes.isEmpty()) {
            System.out.println("Shape List is empty!");
        } else {
            for (Shape shape : shapes) {
                shape.draw();
                System.out.println();
            }
        }
    }
}
