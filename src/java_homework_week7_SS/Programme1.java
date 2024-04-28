package java_homework_week7_SS;

//Write a java program that tells us that Input number is odd or even?

import java.util.Scanner;

public class Programme1 {

    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);// scanner  declaration to read input from the user

        System.out.println("Enter a number: ");//print statement for user to enter the number
        int num = scanner.nextInt();

        scanner.close();

        //ternary operator to check number
        String result = num % 2 == 0 ? "Even" : "odd";
        System.out.println(num + " is " + result);

    }
}
