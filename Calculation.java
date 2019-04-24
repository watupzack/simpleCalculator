package com.company;

public class Calculation {
    public static double calculate(double a, double b, String action) throws Exception {
        double result = 0.0;
        if (action.equals("+")) {
            result = a + b;
        } else if (action.equals("-")) {
            result = a - b;
        } else if (action.equals("/")) {
            result = a / b;
        } else if (action.equals("*")) {
            result = a * b;
        } else {
            throw new Exception();
        }
        return result;
    }
}
