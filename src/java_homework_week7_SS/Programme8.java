package java_homework_week7_SS;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //scanner declaration
        System.out.println("Enter an alphabet(A-F): ");//user input data
        char alphabet = scanner.next().toUpperCase().charAt(0);//convert into uppercase if lowercase entered

        //if condition
        String cityName;
        if (alphabet == 'A') {
            cityName = "Aberdeen";
        } else if (alphabet == 'B') {
            cityName = "Birmingham";
        } else if (alphabet == 'C') {
            cityName = "Cardiff";
        } else if (alphabet == 'D') {
            cityName = "Derby";
        } else if (alphabet == 'E') {
            cityName = "Edinburgh";
        } else if (alphabet == 'F') {
            cityName = "Fareham";
        } else {
            cityName = "Invalid entry";
        }

        // Print the city name
        System.out.println("City name: " + cityName);

        // Close the scanner
        scanner.close();
    }
}

