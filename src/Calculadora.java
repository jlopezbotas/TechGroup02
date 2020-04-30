

public class Calculadora {
    public void calculaSuma(double value1, double value2){
        Suma sum = new Suma(value1,value2);
        System.out.println("EL RESULTADO TAMBIEN ES:"+ sum.getResultado());
        sum.mostrarResultado();
    }
    public void calculaResta(double value1, double value2){
        Resta res = new Resta(value1,value2);
        res.mostrarResultado();
    }
    public void calculaMultiplicacion(double value1, double value2){
        Multiplicacion mul = new Multiplicacion(value1,value2);
        mul.mostrarResultado();
    }
    public void calculaDivision(double value1, double value2){
        Division div = new Division(value1,value2);
        div.mostrarResultado();
    }

}


