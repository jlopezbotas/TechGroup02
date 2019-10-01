/**
 * Class Calculator that is responsible for performing basic mathematical calculations.
 *
 * @author William Claros
 * @version 10/01/2019
 */
public class Calculator {

    /**
     * Method that performs the mathematical operation of the sum.
     *
     * @param number1 whole number
     * @param number2 whole number
     * @return Returns the sum of both numbers.
     */
    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * Method that performs the mathematical operation of the subtraction.
     *
     * @param number1 whole number
     * @param number2 whole number
     * @return Returns the rest of the subtraction from number2 to number1.
     */
    public int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    /**
     * Method that performs the mathematical operation of multiplication.
     *
     * @param number1 whole number
     * @param number2 whole number
     * @return Returns the product of multiplying number1 with number2.
     */
    public int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    /**
     * Method that performs the mathematical operation of the division.
     *
     * @param number1 whole number
     * @param number2 whole number
     * @return Returns the ratio of the division of number1 with number2.
     */
    public int divide(int number1, int number2) {
        int result = 0;
        try {
            return number1 / number2;
        } catch (ArithmeticException error) {
            System.out.println("ArithmeticException found!!!");
            return 0;
        }
    }
}
