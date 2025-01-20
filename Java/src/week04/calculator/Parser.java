package week04.calculator;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) {
        // 구현 1.

    }

    public Parser parseSecondNum(String secondInput) {
        // 구현 1.
    }

    public Parser parseOperator(String operationInput) {
        // 구현 1.
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}