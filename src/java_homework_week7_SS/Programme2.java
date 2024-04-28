package java_homework_week7_SS;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class Programme2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//scanner declaration for user to input data

        System.out.println("Enter a year: ");//ask input from the user
        int year = scanner.nextInt();

        boolean x = (year % 4) == 0; // == is verify both operands are equal
        boolean y = (year % 100) != 0;//!= is verify if both are not equal
        boolean z = ((year % 100 == 0) && (year % 400 == 0));// give as true or false value

        if (x && (y || z)) {//if condition
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
            scanner.close();
        }
    }
}
