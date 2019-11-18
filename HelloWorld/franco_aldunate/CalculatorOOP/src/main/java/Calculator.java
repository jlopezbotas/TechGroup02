/**
 * This class represents a Calculator.
 *
 * @author Franco Aldunate
 * @version 19/10/2019
 */
public class Calculator {
    /**
     * Sums two (double) numbers.
     *
     * @param a number to use in sum operation.
     * @param b number to use in sum operation.
     * @return sum of a and b.
     */
    public double sum(final double a, final double b) {
        return a + b;
    }

    /**
     * Subtraction of two (double) numbers.
     *
     * @param a number to use in subtraction operation.
     * @param b number to use in subtraction operation.
     * @return subtraction of a and b.
     */
    public double sub(final double a, final double b) {
        return a - b;
    }

    /**
     * Multiplies two (double) numbers.
     *
     * @param a number to use in multiplication operation.
     * @param b number to use in multiplication operation.
     * @return multiplication of a and b.
     */
    public double multiply(final double a, final double b) {
        return a * b;
    }

    /**
     * Divides two (double) numbers.
     *
     * @param a number to use in division operation.
     * @param b number to use in division operation.
     * @return division of a and b.
     */
    public double divide(final double a, final double b) {
        if (b == 0) {
            System.out.println("You can\'t divide by zero!");
            return 0;
        }
        return a / b;
    }
}
