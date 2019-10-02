import java.util.Scanner;

public class Display {
    Scanner scanner;
    public Display() {
        scanner = new Scanner(System.in);
    }
    public void start() {
        System.out.println("Welcome!");
    }

    public void displayPartialResult(double partialResult) {
        System.out.println("Total:" + partialResult );
    }

    public String getNextParameter() {
        System.out.println("Please enter a number:");
        return scanner.nextLine();
    }

    public String getOperator() {
        System.out.println("Please enter the operator:");
        return scanner.nextLine();
    }
}
