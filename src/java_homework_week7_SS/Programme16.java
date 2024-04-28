package java_homework_week7_SS;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner declaration

        //ask user to enter number
        System.out.println("Enter a number: ");
        double num = scanner.nextDouble();

        //if condition
        if (num > 0) {
            System.out.println("POSITIVE");
        } else if (num < 0) {
            System.out.println("NEGATIVE");
        } else {
            System.out.println("ZERO");
        }
        //close the scanner
        scanner.close();
    }
}