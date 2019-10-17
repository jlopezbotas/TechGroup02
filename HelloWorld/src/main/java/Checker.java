import java.util.ArrayList;
import java.util.List;

public class Checker {
    private Calculator calc;
    private List<String> operators = new ArrayList<String>() {{
        add("+");
        add("-");
        add("*");
        add("/");
        add("q");
    }};
    private String numberExpression = "-?\\d+(\\.\\d+)?";

    public Checker(Calculator calc) {
        this.calc = calc;
    }
    public boolean isValidOperator(String input) {
        return operators.contains(input);
    }

    public boolean isNumber(String input) {
        return input.matches(numberExpression);
    }
}
