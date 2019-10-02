public class Suma extends Operacion{

    double resultado;

    public Suma(double val1, double val2) {

        super(val1, val2, "+");
        this.resultado = val1 + val2;
        super.setResultado(this.resultado);
    }


}