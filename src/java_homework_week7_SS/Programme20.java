package java_homework_week7_SS;

import java.util.Arrays;

/**
 * Write a Java program to test if an array contains a specific value
 */
public class Programme20 {

    public static void main(String[] args) {//main method

        int[] array = {6, 9, 8, 4, 3};//numeric array

        int specificValue = 8;//specific value for search

        //call currentValue method
        boolean currentValue = currentValue(array, specificValue);

        //if condition
        if (currentValue) {
            System.out.println("The array contains the value " + specificValue);
        } else {
            System.out.println("The array does not contains the value " + specificValue);
        }

    }

    //method for check specific array
    public static boolean currentValue(int[] array, int specificValue) {
        return Arrays.stream(array).anyMatch(value -> value == specificValue);//Arrays.stream() create an IntSteam from the array
    }


}
