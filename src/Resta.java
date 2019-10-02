public class Resta extends Operacion{

    double resultado;

    public Resta(double val1, double val2) {

        super(val1,val2,"-");
        this.resultado = val1 - val2;
        this.setResultado (this.resultado);
    }
}