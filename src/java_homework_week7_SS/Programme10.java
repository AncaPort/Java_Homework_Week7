package java_homework_week7_SS;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Programme10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Scanner Declaration

        // Enter two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Enter arithmetic symbol
        System.out.print("Enter arithmetic symbol (+, -, /, *): ");
        char symbol = scanner.next().charAt(0);

        // if condition for result
        double result;
        if (symbol == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (symbol == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (symbol == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (symbol == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid arithmetic symbol.");
        }

        // Close the scanner
        scanner.close();
    }
}
