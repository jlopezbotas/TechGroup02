public class BasicCalculator {

    public BasicCalculator() {

    }

    /**
     * Add two numbers.
     * @param num1, int
     * @param num2, int
     * @return numbers added.
     */
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Substraction function
     * @param num1 number that is going to be substracted.
     * @param num2 number to substract.
     * @return number substracted.
     */
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Multiply function.
     * @param num1 number 1.
     * @param num2 number 2.
     * @return Multiplication.
     */
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Division function.
     * @param dividend
     * @param divisor
     * @return division.
     */
    public double divide(int dividend, int divisor) {
        return divisor == 0 ? Double.POSITIVE_INFINITY : (double) dividend / divisor;
    }

    public static void main(String [] args) {
        BasicCalculator calculator = new BasicCalculator();
    }
}