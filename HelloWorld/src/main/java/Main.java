public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Display display = new Display();
        Checker checker = new Checker(calculator);
        String inputOperator, operator, inputValue, value, partialResult;
        display.start();
        while(calculator.on) {
            display.displayPartialResult(calculator.partial);
            inputOperator = display.getOperator();
            operator = checker.isValidOperator(inputOperator)? inputOperator: "?";
            inputValue = display.getNextParameter();
            value = checker.isNumber(inputValue)? inputValue : "0";
            partialResult = calculator.doOperation(operator, value);
            try {
                calculator.partial = Double.parseDouble(partialResult);
            } catch (Exception exception) {
                System.out.println(partialResult);
                calculator.partial = 0;
            }
        }
    }
}
