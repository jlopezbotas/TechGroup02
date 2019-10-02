package calculator;

public class CalculatorOperations {

    /**
     * Method that add two values
     *
     * @param firstValue integer or double
     * @param secondValue integer or double
     * @return double
     */
    public static double add(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    /**
     * Method that subtraction two values
     *
     * @param firstValue integer or double
     * @param secondValue integer or double
     * @return double
     */
    public static double subtraction(double firstValue, double secondValue) {
        return roundNumber(firstValue - secondValue, 2);
    }

    /**
     * Method that multiplication two values
     *
     * @param firstValue integer or double
     * @param secondValue integer or double
     * @return double
     */
    public static double multiplication(double firstValue, double secondValue) {
        if (firstValue == 0 || secondValue == 0) {
            return 0;
        } else {
            return roundNumber(firstValue * secondValue, 4);
        }
    }

    /**
     * Method that division two values
     *
     * @param firstValue integer or double
     * @param secondValue integer or double
     * @return double
     */
    public static double division(double firstValue, double secondValue) {
        if (secondValue == 0) {
            return -0.0;
        } else {
            return roundNumber(firstValue / secondValue, 4);
        }
    }

    /**
     * Method that round a number decimal in n digits
     *
     * @param number number decimal
     * @param digits cant of number to round
     * @return double
     */
    public static double roundNumber(double number, int digits) {
        return Math.round(number * Math.pow(10, digits)) / Math.pow(10, digits);
    }
}
