package java_homework_week7_SS;
//Write a java program to input any number and find out if it’s odd or even.

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is odd or even
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Close the scanner
        scanner.close();
    }


}
