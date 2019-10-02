package main.java.com.model;

public class Calculator {
    public int Addition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int Subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int Multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int Divide(int firstNumber, int secondNumber) {
        if(secondNumber == 0) {
            throw new IllegalArgumentException("Cannot division by zero");
        } else {
            return firstNumber / secondNumber;
        }
    }
}
