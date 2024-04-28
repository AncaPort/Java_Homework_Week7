package java_homework_week7_SS;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Programme11 {

    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3:");//print statement
        printDivisibleByThree();//method calling

        System.out.println("\nNumbers divisible by 5:");//print statement
        printDivisibleByFive();//method calling
    }

    public static void printDivisibleByThree() { //Static method
        for (int i = 1; i <= 100; i++) {//if condition
            if (i % 3 == 0) {
                System.out.println(i + " ");
            }
        }
    }

    public static void printDivisibleByFive() {//static method
        for (int i = 1; i <= 100; i++) {//if condition
            if (i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
    }

}
