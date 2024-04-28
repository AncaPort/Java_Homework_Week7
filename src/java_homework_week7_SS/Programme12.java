package java_homework_week7_SS;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol
 */
public class Programme12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Declare scanner

        //ask user enter value
        System.out.println("Enter a value: ");
        char input = scanner.next().charAt(0);

        //if condition
        if (Character.isDigit(input)) {
            System.out.println("Entered value is a number.");
        } else if (Character.isLetter(input)) {
            System.out.println("Entered value is an alphabet.");
        } else {
            System.out.println("entered value is a symbol.");
        }
        scanner.close();
    }
}
