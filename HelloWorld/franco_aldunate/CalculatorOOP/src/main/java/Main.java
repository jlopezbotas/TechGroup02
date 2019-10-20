import java.util.Scanner;

/**
 * This class is used to execute Calculator program.
 *
 * @author Franco Aldunate
 * @version 19/10/2019
 */
public class Main {
    private static final String SUM = "sum";
    private static final String SUB = "sub";
    private static final String MULTIPLY = "multiply";
    private static final String DIVIDE = "divide";

    public static void main(String[] args) {
        final Calculator calculator = new Calculator();
        final Scanner scannerInput = new Scanner(System.in);
        boolean isActive = true;
        String operationName = "";
        double result = 0;
        System.out.println("Initializing Calculator...");

        while (isActive) {
            System.out.print("Select an option: sum(1) sub(2) multiply(3) divide(4): ");
            int option = scannerInput.nextInt();
            System.out.println("Enter values for operation:");
            System.out.print("Enter first(a) value: ");
            final double a = scannerInput.nextDouble();
            System.out.print("Enter second(b) value: ");
            final double b = scannerInput.nextDouble();
            switch (option) {
                case 1:
                    result = calculator.sum(a, b);
                    operationName = SUM;
                    break;
                case 2:
                    result = calculator.sub(a, b);
                    operationName = SUB;
                    break;
                case 3:
                    result = calculator.multiply(a, b);
                    operationName = MULTIPLY;
                    break;
                case 4:
                    result = calculator.divide(a, b);
                    operationName = DIVIDE;
                    break;
            }
            System.out.println(String.format("Result %s(%s, %s): %s", operationName, a, b, result));

            System.out.print("Continue? Y/N: ");
            final String selection = scannerInput.next();
            if (selection.equalsIgnoreCase("Y")) {
                isActive = false;
            }
        }
    }
}
