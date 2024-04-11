package org.example;

public class Calculator {
    private static final String ZERO_DIVIDER_ERROR = "Divider can't be zero";

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException(ZERO_DIVIDER_ERROR);
        }
        return a / b;
    }
}
