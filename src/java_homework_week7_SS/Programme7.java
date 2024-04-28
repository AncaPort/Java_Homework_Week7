package java_homework_week7_SS;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme7 {
    public static void main(String[] args) {
        // Declare a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input sales details
        System.out.print("Enter sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()

        System.out.print("Enter seller's name: ");
        String sellerName = scanner.nextLine();

        System.out.print("Enter sales amount: ");
        double salesAmount = scanner.nextDouble();

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculation of sales commission
        double commission = 0;
        if (salesAmount >= 50000) {
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 0.05;
        } else {
            commission = salesAmount * 0.02;
        }

        // Print sales commission
        System.out.println("Sales commission: " + commission);

        // Close the scanner
        scanner.close();
    }


}
