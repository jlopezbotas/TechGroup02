import java.util.Scanner;

/**
 * This class executes Printer Project OOP.
 *
 * @author Franco Aldunate
 * @version 16/11/2019
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Initializing Printer Project OOP...");
        final Scanner scannerInput = new Scanner(System.in);
        final Printer printer = new Printer();
        boolean isActive = true;
        char character;

        while (isActive) {
            printer.printMenu();
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
                    printer.addShape(rectangle);
                    continue;
                case 2:
                    System.out.println("Triangle selected");
                    System.out.print("Enter height: ");
                    int triangleHeight = scannerInput.nextInt();
                    System.out.print("Enter character: ");
                    character = scannerInput.next().charAt(0);
                    Triangle triangle = new Triangle(triangleHeight, character);
                    printer.addShape(triangle);
                    continue;
                case 3:
                    System.out.println("Rhombus selected");
                    System.out.print("Enter character: ");
                    character = scannerInput.next().charAt(0);
                    Rhombus rhombus = new Rhombus(character);
                    printer.addShape(rhombus);
                    boolean isHeightSet = false;
                    while (!isHeightSet) {
                        System.out.print("Enter height: ");
                        int rhombusHeight = scannerInput.nextInt();
                        isHeightSet = rhombus.setHeight(rhombusHeight);
                        if (!isHeightSet) {
                            System.out.println("Height must be an odd number!");
                        }
                    }
                    continue;
                case 4:
                    printer.printShapes();
                    continue;
                case 5:
                    isActive = false;
                    break;
            }
        }
    }
}
