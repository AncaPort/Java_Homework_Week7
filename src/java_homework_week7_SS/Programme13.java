package java_homework_week7_SS;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Scanner declaration

        //Ask user for input number 1 to 7
        System.out.println("Enter a number between 1 to 7: ");
        int dayNumber = scanner.nextInt();

        //switch statement
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "WEDNESDAY";
                break;
            case 4:
                dayName = "THURSDAY";
                break;
            case 5:
                dayName = "FRIDAY";
                break;
            case 6:
                dayName = "SATURDAY";
                break;
            case 7:
                dayName = "SUNDAY";
                break;
            default:
                dayName = "Week contains 1 to 7 days";
        }
        System.out.println(dayName);//print message

        scanner.close();
    }
}
