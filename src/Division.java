public class Division extends Operacion{

    double resultado = 0;

    public Division(double val1, double val2) {
        super(val1,val2,"/");
         if(val2==0) System.out.println("No se puede dividir entre cero");
        else this.resultado = val1 / val2;
        this.setResultado(this.resultado);
    }
}