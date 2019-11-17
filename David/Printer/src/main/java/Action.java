import java.util.ArrayList;

class Action {

    Figure getFigure(final int option, final char charFiller, final int height, final int width){
        Figure figure;
        switch (option){
            case 1: figure = new Rectangule(charFiller, height, width); break;
            case 2: figure = new Triangule(charFiller, height); break;
            case 3: figure = new Rhombus(charFiller, height); break;
            default: figure = null; break;
        }
        return figure;
    }
    static void print(final ArrayList<Figure> figures){
        for (Figure figure : figures) {
            figure.print();
        }
    }
    static void exit(final ArrayList figures){
        figures.clear();
        System.exit(0);
    }
}
