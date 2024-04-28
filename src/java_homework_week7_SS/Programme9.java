package java_homework_week7_SS;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry using switch statement
 */
public class Programme9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//Scanner declaration

        // Enter an alphabet from A to F
        System.out.print("Enter an alphabet (A-F): ");
        char alphabet = scanner.next().toUpperCase().charAt(0); // Converting uppercase into lowercase inputs

        // using a switch statement
        String cityName;
        switch (alphabet) {
            case 'A':
                cityName = "Aberdeen";
                break;
            case 'B':
                cityName = "Birmingham";
                break;
            case 'C':
                cityName = "Cardiff";
                break;
            case 'D':
                cityName = "Derby";
                break;
            case 'E':
                cityName = "Edinburgh";
                break;
            case 'F':
                cityName = "Fareham";
                break;
            default:
                cityName = "Invalid entry";
        }

        // Print the city name
        System.out.println("City name: " + cityName);

        // Close the scanner
        scanner.close();
    }
}
