package main.java;

import java.util.ArrayList;

public abstract class Figure {

    int height;
    char sign;

    ArrayList<ArrayList<Character>> figureBody = new ArrayList<>();

    public Figure() {}

    protected void print() {
        for(ArrayList<Character> arrayHeight : this.figureBody){
            for (Character elementFigure : arrayHeight) {
                System.out.print(elementFigure);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    protected abstract void createBodyFigure();

    public ArrayList<ArrayList<Character>> getFigureBody() {
        return this.figureBody;
    }
}
