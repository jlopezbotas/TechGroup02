package main.java.com.model;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Calculator calculator = new Calculator();
        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        Integer firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        Integer secondNumber = scanner.nextInt();
        Menu.DisplayMenu();
        Integer option = scanner.nextInt();

        switch(option) {
            case 1:
                System.out.println("The result of operation is: " + calculator.Addition(firstNumber, secondNumber));
                break;
            case 2:
                System.out.println("The result of operation is: " + calculator.Subtraction(firstNumber, secondNumber));
                break;
            case 3:
                System.out.println("The result of operation is: " + calculator.Multiply(firstNumber, secondNumber));
                break;
            case 4:
                System.out.println("The result of operation is: " + calculator.Divide(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Please select an option displayed in the menu.");
        }
    }
}
