package com.calculator.view;

import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner = new Scanner(System.in);

    public double getNumber(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public char getOperator() {
        System.out.print("Enter operator (+, -, *, /): ");
        System.out.print("Your choice is Good");

        return scanner.next().charAt(0);

    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }
}
