package WilsonLopez;

public class Calculator {

    public Calculator() {}

    /**
     * Adds two numbers.
     *
     * @param num1 - First value.
     * @param num2 - Second value.
     *
     * @return Sum between two numbers.
     */
    public int sum(final int num1, final int num2) {
        return num1 + num2;
    }

    /**
     * Subtracts two numbers.
     *
     * @param num1 - First value.
     * @param num2 - Second value.
     *
     *@return Subtraction between two numbers
     */
    public int subtraction(final int num1, final int num2) {
        return num1 - num2;
    }

    /**
     * Multiply two numbers.
     *
     * @param num1 - First value.
     * @param num2 - Second value.
     *
     * @return Multiplication between two numbers.
     */
    public int multiplication(final int num1, final int num2) {
        return num1 * num2;
    }

    /**
     * Division between two numbers.
     * @param num1 - First value.
     * @param num2 - Second value.
     *
     * @return Division between two numbers.
     */
    public int division(final int num1, final int num2) {
        return num1 / num2;
    }
}
