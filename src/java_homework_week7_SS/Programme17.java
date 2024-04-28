package java_homework_week7_SS;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class Programme17 {

    public static void main(String[] args) {//main method

        int[] numericArray = {100, 99, 12, 54, 34};//numeric Array

        String[] stringArray = {"Java", "Python", "C++", "SQL", "HTML"};

        Arrays.sort(numericArray);//sorting numeric array

        Arrays.sort(stringArray);//sorting string array

        //print the arrays in statement
        System.out.println("sorted numeric Array: ");
        System.out.println(Arrays.toString(numericArray));
        System.out.println("Sorted String Array: ");
        System.out.println(Arrays.toString(stringArray));
    }
}
