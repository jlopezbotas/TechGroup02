public class Multiplicacion extends Operacion{

    double resultado;

    public Multiplicacion(double val1, double val2) {

        super(val1, val2, "*");
        this.resultado = val1 * val2;
        this.setResultado(this.resultado);
    }
}