package com.company;

import java.util.Scanner;

public class Main {
    static double firstOperand;
    static double secondOperand;
    static String operation;

    static double answer;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first operand: ");
            firstOperand = scanner.nextDouble();

            System.out.print("Select the operation: ");
            operation = scanner.next();

	        System.out.print("Enter second operand: ");
	        secondOperand = scanner.nextDouble();

	        try {
                answer = Calculation.calculate(firstOperand, secondOperand, operation);
                System.out.println("The answer = " + answer);
            } catch (Exception ex) {
	            System.out.println("Invalid operation");
            }
    }
}
