public class Operacion {
    protected double val1;
    protected double val2;
    private double resultado;
    protected String typo;

    Operacion(double val1,double val2, String typo){
        this.val1=val1;
        this.val2=val2;
        this.typo =typo;
    }
    public void mostrarResultado(){

        System.out.println(this.val1+" "+this.typo+" "+this.val2+" = "+ this.getResultado());

    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
