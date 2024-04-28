package java_homework_week7_SS;

import java.util.Arrays;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme19 {

    public static void main(String[] args) {

        int[] array = {54, 29, 99, 121, 47}; // Numeric array

        double average = averageArray(array);// Call the averageArray method

        // Print statement for average value of the array
        System.out.println("Average value of the array elements: " + average);
    }

    // Method for array calculation
    public static double averageArray(int[] array) {

        return Arrays.stream(array).average().orElse(0);//Arrays.stream() to create an IntStream from the array
    }

}
