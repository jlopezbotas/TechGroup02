public class Main {
    public  static void main(String[] arg){
        ValueHolder valueHolder  = new Menu().makechoise();

        if (valueHolder.getOption() == 1) {
            new Calculadora().calculaSuma(valueHolder.getValue1(),valueHolder.getValue2());
        } else if (valueHolder.getOption() == 2) {
            new Calculadora().calculaResta(valueHolder.getValue1(),valueHolder.getValue2());

        } else if (valueHolder.getOption() == 3) {
            new Calculadora().calculaMultiplicacion(valueHolder.getValue1(),valueHolder.getValue2());
        } else if (valueHolder.getOption() == 4) {
            new Calculadora().calculaDivision(valueHolder.getValue1(),valueHolder.getValue2());
        } else if (valueHolder.getOption() == 5) {
            System.out.println("Hasta luego!");
        }

    }
}
