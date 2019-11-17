package main.java;

import java.util.ArrayList;

public class FigureManager {

    ArrayList<Figure> figuresList = new ArrayList<>();

    public FigureManager() {}

    public void createRectangleFigure(int width, int height, char sign){
        figuresList.add(new Rectangle(width, height, sign));
    }

    public void createTriangleFigure(int height, char sign){
        figuresList.add(new Triangle(height, sign));
    }

    public void createRhombeFigure(int height, char sign){
        figuresList.add(new Rhombus(height, sign));
    }

    public void printFigures() {
        for(Figure figure : figuresList) {
            figure.print();
        }
        figuresList.clear();
    }

}
