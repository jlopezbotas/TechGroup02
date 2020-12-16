package main.java;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private FigureManager manager = new FigureManager();

    private boolean exitProgram = false;
    private int option = 0;

    public Menu() {}

    private void printMenu() {
        System.out.println("Printer Project");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Rhombus");
        System.out.println("4. Print!");
        System.out.println("5. Exit");
    }

    private boolean receiveOption() {
        do{
            System.out.println("Choose one of the options between 1 to 5.");
            option = receiveIntParameter();
        } while (option < 0 || option > 5);
        return option == 5;
    }

    private int receiveIntParameter() {
        while(!scanner.hasNextInt()) scanner.next();
        return scanner.nextInt();
    }

    private char receiveCharParameter() {
        while(!scanner.hasNextLine()) scanner.next();
        return scanner.next().charAt(0);
    }

    private void createRectangle() {
        System.out.println("Rectangle");
        System.out.print("Enter width: ");
        int widthParam = this.receiveIntParameter();
        System.out.print("Enter height: ");
        int heightParam = this.receiveIntParameter();
        System.out.print("Enter char: ");
        char signParameter = this.receiveCharParameter();
        manager.createRectangleFigure(widthParam, heightParam, signParameter);
    }

    private void createTriangle() {
        System.out.println("Triangle");
        int heightParam = 0;
        do{
            System.out.print("Enter height(not less than 2): ");
            heightParam = this.receiveIntParameter();
        } while(heightParam < 2);
        System.out.print("Enter char: ");
        char signParameter = this.receiveCharParameter();
        manager.createTriangleFigure(heightParam, signParameter);
    }

    private void createRhombus() {
        System.out.println("Rhombus");
        int heightParam = 0;
        do{
            System.out.print("Enter height(odd number and not less than 3): ");
            heightParam = this.receiveIntParameter();
        } while(heightParam % 2 == 0 || heightParam < 3);
        System.out.print("Enter char: ");
        char signParameter = this.receiveCharParameter();
        manager.createRhombeFigure(heightParam, signParameter);
    }

    private void actionOptions() {
        switch (option) {
            case 1:
                this.createRectangle();
                break;
            case 2:
                this.createTriangle();
                break;
            case 3:
                this.createRhombus();
                break;
            case 4:
                manager.printFigures();
                break;
            case 5:
                break;
        }
    }

    public void runProgram() {
        System.out.println("Welcome to Printer Project V1");
        do {
            this.printMenu();
            exitProgram = this.receiveOption();
            this.actionOptions();
        } while(!exitProgram);
    }
}
