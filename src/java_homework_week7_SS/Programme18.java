package java_homework_week7_SS;

import java.util.Arrays;

/**
 * Write a Java program to sum values of an array.
 */
public class Programme18 {

    public static void main(String[] args) {//main method

        int[] array = {4, 67, 34, 108, 88, 54};//numeric array

        int sum = sumArray(array);//call sumArray method

        System.out.println("Sum of the array is: " + sum);

    }

    //method for sum calculation
    public static int sumArray(int[] array) {
        return Arrays.stream(array).sum();//Arrays.stream() to create an IntSteam from the array
    }
}
