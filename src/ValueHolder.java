public class ValueHolder {
    int option;
    double value1;
    double value2;

    ValueHolder(int option, double value1, double value2){
        this.option = option;
        this.value1 =value1;
        this.value2 = value2;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public int getOption() {
        return option;
    }
}
