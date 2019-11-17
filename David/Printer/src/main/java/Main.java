import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        Interface readAction = new Interface();
        do {
            int option = readAction.askForValidOption();
            switch (option){
                case 1:
                    figures.add(readAction.askForRectangule()); break;
                case 2:
                    figures.add(readAction.askForTriangule()); break;
                case 3:
                    figures.add(readAction.askForRhombus()); break;
                case 4: Action.print(figures); break;
                case 5: Action.exit(figures); break;
                default:
                    System.out.println("Non valid option");
                    break;
            }
        }while (true);
    }
}
