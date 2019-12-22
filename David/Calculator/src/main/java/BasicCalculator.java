class BasicCalculator {

    private BasicCalculator(){

    }

    /**
     * Add operation on two integer numbers.
     * @param a number
     * @param b number
     * @return add result
     */
    static int add(int a, int b){
        try {
            return a + b;
        }catch (NumberFormatException  e){
            System.out.println("One or more inputs is not a valid number");
            return 0;
        }
    }
    /**
     * Subtract operation on two integer numbers.
     * @param a number
     * @param b number
     * @return subtraction result
     */
    static int subtract(int a, int b){
        try {
            return a - b;
        }catch (NumberFormatException  e){
            System.out.println("One or more inputs is not a valid number");
            return 0;
        }
    }
    /**
     * Multiplicate operation on two integer numbers.
     * @param a number
     * @param b number
     * @return multiplicate result
     */
    static int multiplicate(int a, int b){
        try {
            return a * b;
        }catch (NumberFormatException  e){
            System.out.println("One or more inputs is not a valid number");
            return 0;
        }
    }
    /**
     * Divide operation on two integer numbers.
     * @param a number
     * @param b number
     * @return divide result
     */
    static float divide(float a, float b){
        try {
            return a / b;
        }catch (ArithmeticException e){
            System.out.println("Division by zero detected");
            return 0;
        }
        catch (NumberFormatException e){
            System.out.println("One or more inputs is not a valid number");
            return 0;
        }
    }
}
