package main.java;

import java.util.ArrayList;

public class Rectangle extends Figure {

    int width;

    public Rectangle(int width, int height, char sign) {
        this.width = width;
        this.height = height;
        this.sign = sign;
        this.createBodyFigure();
    }

    @Override
    protected void createBodyFigure() {
        for(int i = 0; i < height; i++) {
            ArrayList<Character> array = new ArrayList<>();
            for(int j = 0; j < width; j++){
                array.add(this.sign);
            }
            this.figureBody.add(array);
        }
    }
}
