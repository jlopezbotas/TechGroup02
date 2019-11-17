import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Printer {
    static List<Shape> shapeList = new ArrayList<Shape>();

    static void mainMenu() {
        int option = 0;
        while (option != 5) {
            System.out.println("Main Project. Select an option");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Rhombus");
            System.out.println("4. Print!");
            System.out.println("5. Exit");
            final Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    shapeList.add(rectangleMenu());
                    break;
                case 2:
                    shapeList.add(triangleMenu());
                    break;
                case 3:
                    System.out.println("WIP");
                    break;
                case 4:
                    printAllShapes();
                    break;
                case 5:
                    System.out.println("gracias pro participar");
                    break;
            }
        }
    }

    static Rectangle rectangleMenu() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Rectangle");
        System.out.println("Enter width: ");
        final int width = scanner.nextInt();
        System.out.println("Enter height:");
        final int height = scanner.nextInt();
        System.out.print("Enter char: ");
        final Scanner scanner2 = new Scanner(System.in);
        final String printChar = scanner2.nextLine();
        return new Rectangle(printChar, width, height);
    }

    static Triangle triangleMenu() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Triangle");
        System.out.println("Enter height:");
        final int height = scanner.nextInt();
        System.out.println("Enter char: ");
        final Scanner scanner2 = new Scanner(System.in);
        final String printChar = scanner2.nextLine();
        return new Triangle(printChar, height);
    }

    static void printAllShapes() {
        for (final Shape shape : shapeList) {
            System.out.println(shape.print());
        }
    }
}
