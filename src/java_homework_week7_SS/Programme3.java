package java_homework_week7_SS;

import java.util.Scanner;

public class Programme3 {
    /**
     * Write a java program to input student Name, roll No, and three subjects Math, Science and
     * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
     * Input, Marks should between 0 to 100”) and find out total, percentage and result.
     * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
     * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
     * _______________________________
     * | |
     * | Mark Sheet |
     * |_______________________________|
     * | Name : Jay |
     * | Roll No: 08 |
     * |_______________________________|
     * | Subjects : Marks |
     * |_______________________________|
     * | Math : 98 |
     * | Science : 90 |
     * | English : 85 |
     * |_______________________________|
     * | Total : 273 |
     * |_______________________________|
     * | Percentage : 91.0 |
     * | Result : Pass |
     * | Grade : A+ |
     * |_______________________________
     */
    public static void main(String[] args) {
        //Enter student detail
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Student Roll No: ");
        int rollNo = scanner.nextInt();

        //Enter marks of 3 subject.
        System.out.println("Enter marks for Math, Science, and English ");
        int mathMarks = scanner.nextInt();
        int scienceMarks = scanner.nextInt();
        int englishMarks = scanner.nextInt();

        //validate marks using if condition
        if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100 ");
            return;
        }
//calculation of total marks
        int totalMarks = mathMarks + scienceMarks + englishMarks;

        //calculation of percentage
        double percentage = (double) totalMarks / 3;

        //for result and grade calculation
        String result, grade;
        if (percentage >= 35) {
            result = "Pass";
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "C";
            }
        } else {
            result = "Fail";
            grade = "N/A";//
        }
        //print marksheet
        System.out.println("---------------------------------");
        System.out.println("|                                 |");
        System.out.println("|           Mark Sheet          |");
        System.out.println("|_______________________________|");
        System.out.println("| Name     : " + name + "          |");
        System.out.println("| Roll No  : " + rollNo + "               |");
        System.out.println("|_______________________________|");
        System.out.println("| Subjects : Marks             |");
        System.out.println("|_______________________________|");
        System.out.println("| Math     : " + mathMarks + "              |");
        System.out.println("| Science  : " + scienceMarks + "                  |");
        System.out.println("| English  : " + englishMarks + "                  |");
        System.out.println("|_______________________________|");
        System.out.println("| Total    : " + totalMarks + "            |");
        System.out.println("|_______________________________|");
        System.out.println("| Percentage : " + percentage + "      |");
        System.out.println("| Result   : " + result + "           |");
        System.out.println("| Grade    : " + grade + "            |");
        System.out.println("|_______________________________|");
        scanner.close();
    }
}
