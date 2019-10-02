public class Calculator {
    double partial;
    boolean on;

    Calculator() {
        partial = 0;
        on = true;
    }

    public String add(double firstValue, double secondValue) {
        return String.valueOf(firstValue + secondValue);
    }

    public String subtract(double firstValue, double secondValue) {
        return String.valueOf(firstValue - secondValue);
    }

    public String multiply(double firstValue, double secondValue) {
        return String.valueOf(firstValue * secondValue);
    }

    public String divide(double firstValue, double secondValue) {
        if (secondValue == 0)
            return "Cannot divide by zero";
        return String.valueOf(firstValue / secondValue);
    }
    public String doOperation(String operator, String value) {
        switch(operator){
            case "+":
                return add(partial, Double.parseDouble(value));
            case "-":
                return subtract(partial, Double.parseDouble(value));
            case "*":
                return multiply(partial, Double.parseDouble(value));
            case "/":
                return divide(partial, Double.parseDouble(value));
            case "q":
                on = false;
                return "Shutting down...";
            default:
                return String.format("No valid operator '%s'", operator);
        }
    }
}
