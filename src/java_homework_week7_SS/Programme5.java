package java_homework_week7_SS;
/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        // Declare a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()

        System.out.print("Enter employee name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculation of HRA, TA, DA, PF
        double hra = basicSalary * 0.10;
        double ta = basicSalary * 0.08;
        double da = basicSalary * 0.09;
        double pf = basicSalary * 0.20;

        // Calculate Gross Salary
        double grossSalary = basicSalary + hra + ta + da - pf;

        // Print Salary Slip
        System.out.println("_______________________________");
        System.out.println("|           Salary Slip         |");
        System.out.println("|______________________________|");
        System.out.println("| Employee Id    : " + empId + "        |");
        System.out.println("| Employee Name  : " + empName + "       |");
        System.out.println("|______________________________|");
        System.out.println("| Basic Salary   : " + basicSalary + "       |");
        System.out.println("| HRA 10%        : " + hra + "       |");
        System.out.println("| TA 8%          : " + ta + "       |");
        System.out.println("| DA 9%          : " + da + "       |");
        System.out.println("| PF - 20%       : " + pf + "       |");
        System.out.println("|______________________________|");
        System.out.println("| Gross Salary   : " + grossSalary + "       |");
        System.out.println("|===========================|");

        // Close the scanner
        scanner.close();
    }
}

