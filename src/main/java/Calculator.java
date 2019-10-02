package main.java;

public class Calculator {
    public static int sum(final int number1, final int number2) {
        return number1 + number2;
    }

    public static int subtraction(final int number1, final int number2) {
        return number1 - number2;
    }

    public static int multiplication(final int number1, final int number2) {
        return number1 * number2;
    }

    public static int division(final int number1, final int number2) {
        if (number1 > 0) {
            return number1 / number2;
        } else {
            return 0;
        }
    }
}
