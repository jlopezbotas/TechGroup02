import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class executes Printer Project OOP.
 *
 * @author Franco Aldunate
 * @version 16/11/2019
 */
public class Main {
    public static void main(String[] args) {
        final Scanner scannerInput = new Scanner(System.in);
        final String menu = "\nPrinter Project: Please select an option\n"
                .concat("1. Rectangle\n")
                .concat("2. Triangle\n")
                .concat("3. Rhombus\n")
                .concat("4. Print!\n")
                .concat("5. Exit\n");
        final List<Shape> shapes = new ArrayList<Shape>();
        boolean isActive = true;
        char character;
        System.out.println("Initializing Printer Project OOP...");

        while (isActive) {
            System.out.println(menu);
            int selection = scannerInput.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Rectangle selected");
                    System.out.print("Enter width: ");
                    int widthRectangle = scannerInput.nextInt();
                    System.out.print("Enter height: ");
                    int heightRectangle = scannerInput.nextInt();
                    System.out.print("Enter character: ");
                    character = scannerInput.next().charAt(0);
                    Rectangle rectangle = new Rectangle(widthRectangle, heightRectangle, character);
                    shapes.add(rectangle);
                    continue;
                case 2:
                    System.out.println("Triangle selected");
                    System.out.print("Enter height: ");
                    int triangleHeight = scannerInput.nextInt();
                    System.out.print("Enter character: ");
                    character = scannerInput.next().charAt(0);
                    Triangle triangle = new Triangle(triangleHeight, character);
                    shapes.add(triangle);
                    continue;
                case 3:
                    System.out.println("Rhombus selected");
                    System.out.print("Enter character: ");
                    character = scannerInput.next().charAt(0);
                    Rhombus rhombus = new Rhombus(character);
                    shapes.add(rhombus);
                    boolean isHeightSet = false;
                    while (!isHeightSet) {
                        System.out.print("Enter height: ");
                        int rhombusHeight = scannerInput.nextInt();
                        isHeightSet = rhombus.setHeight(rhombusHeight);
                        if (!isHeightSet){
                            System.out.println("Height must be an odd number!");
                        }
                    }
                    continue;
                case 4:
                    System.out.println("Printing Shapes...");
                    if (shapes.isEmpty()) {
                        System.out.println("Shape List is empty!");
                    } else {
                        for (Shape shape : shapes) {
                            shape.draw();
                            System.out.println();
                        }
                    }
                    continue;
                case 5:
                    isActive = false;
                    break;
            }
        }
    }
}
