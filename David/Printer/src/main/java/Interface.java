import java.util.Scanner;

class Interface {
    Scanner sc = new Scanner(System.in);
    Action action = new Action();
    int option = 0;
    char charFiller;
    int height;
    int width;
    int askForValidOption(){
        do {
            System.out.println("Select a valid option:");
            System.out.println("1 - Rectangule");
            System.out.println("2 - Triangule");
            System.out.println("3 - Rhombus");
            System.out.println("4 - Print");
            System.out.println("5 - Exit");
            option = sc.nextInt();
        }while (option < 0 || option > 6);
        return option;
    }

    Figure askForRectangule(){
        System.out.println("RECTANGULE");
        this.charFiller = askForPrintableChar();
        this.height = askForMetric("height");
        this.width = askForMetric("width");
        return action.getFigure(1,this.charFiller,this.height,this.width);
    };
    Figure askForTriangule(){
        System.out.println("TRIANGULE");
        this.charFiller = askForPrintableChar();
        this.height = askForMetric("height");
        return action.getFigure(2,this.charFiller,this.height,0);
    };
    Figure askForRhombus(){
        System.out.println("Rhombus");
        this.charFiller = askForPrintableChar();
        this.height = askForMetric("height");
        return action.getFigure(3,this.charFiller,this.height,0);
    };

    private char askForPrintableChar(){
        System.out.println("Type a printable character to use : ");
        return sc.next().charAt(0);
    }
    private int askForMetric(final String metric){
        System.out.println("Enter "+ metric +" of the selected figure : ");
        return sc.nextInt();
    }
}
