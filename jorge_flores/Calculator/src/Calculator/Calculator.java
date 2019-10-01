package Calculator;

import java.util.ArrayList;

public class Calculator {

    /**
     * Performs the addition.
     *
     * @param number1 is an integer
     * @param number2 is an integer
     * @return Returns the sum of both numbers.
     */
    public int addition(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * Performs the subtraction.
     *
     * @param number1 is an integer
     * @param number2 is an integer
     * @return Returns the sum of both numbers.
     */
    public int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    /**
     * Performs the multiplication.
     *
     * @param number1 is an integer
     * @param number2 is an integer
     * @return Returns the sum of both numbers.
     */
    public int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    /**
     * Performs the division.
     *
     * @param number1 is an integer
     * @param number2 is an integer
     * @return Returns the sum of both numbers.
     */
    public int division(int number1, int number2) {
        try {
            return number1 / number2;
        } catch (ArithmeticException error) {
            System.out.println(error.getMessage());
            return 0;
        }
    }

    /**
     * Performs the mathematical operations.
     *
     * @param numbers is an array that contain int values
     * @param operators is an array that contain char values
     * @return Returns the sum numbers with operations.
     */
    public int resolveOperationsWithNNumbers(int[ ] numbers, char[ ] operators) {
        int res = numbers[0];
        for(int index = 1; index < numbers.length; index++)
        {
            res =+ numbersWithOperators(res, numbers[index], operators[index - 1]);
        }
        return res;
    }

    /**
     * Performs the mathematical operations of two numbers with one operator.
     *
     * @param number1 is an integer
     * @param number2 is an integer
     * @param operator is an operator value
     * @return Returns the operator and numbers
     */
    public int numbersWithOperators(int number1, int number2, char operator) {
        int res = 0;
        switch (operator)
        {
            case '+' :
                res = addition(number1, number2);
                break;
            case '-' :
                res = subtraction(number1, number2);
                break;
            case '*' :
                res = multiplication(number1, number2);
                break;
            case '/' :
                res = division(number1, number2);
                break;
        }
        return res;
    }
}
