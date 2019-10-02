public class Calculator {

    protected static String calculate(String value1, String value2, String operator) {
        double result = 0;
        if (operator.equals("/")) {
            result = Double.parseDouble(value1) / Double.parseDouble(value2);
        }
        if (operator.equals("x")) {
            result = Double.parseDouble(value1) * Double.parseDouble(value2);
        }
        if (operator.equals("+")) {
            result = Double.parseDouble(value1) + Double.parseDouble(value2);
        }
        if (operator.equals("-")) {
            result = Double.parseDouble(value1) - Double.parseDouble(value2);
        }

        return Double.toString(result);
    }

    protected static boolean existDot(String string) {
        boolean result = false;
        for (int i = 0; i < string.length(); i++) {
            if ((".").equals(string.charAt(i) + "")) {
                result = true;
                break;
            }
        }
        return result;
    }
}
