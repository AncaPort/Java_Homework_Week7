package java_homework_week7_SS;
/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */

import java.util.Scanner;

public class Programme4 {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");//enter user data
        int year = scanner.nextInt();
        System.out.println("Is leap year: " + isLeapYear(year));

        System.out.print("Enter a month: ");
        int month = scanner.nextInt();
        System.out.print("Enter a year: ");
        int yearForMonth = scanner.nextInt();
        System.out.println("Days in the month: " + getDaysInMonth(month, yearForMonth));

        scanner.close();
    }

    //if condition
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }

    public static int getDaysInMonth(int month, int year) {//days of month counting
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {//switch statement
                case 2:
                    return (isLeapYear(year)) ? 29 : 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }
    }
}
