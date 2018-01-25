/*
 * Lesson 7 Coding Activity Question 1
 *
 * Input a positive three digit integer. Print out the digits one per line.
 *
 * Sample run:

Please enter a three digit number:
678

Here are the digits:
6
7
8

*/

import java.util.Scanner;
import java.lang.Math;

class Lesson_7_Activity_Two {
    public static void main(String[] args) {

        /* Write your code here
         * Copy and paste your entire code to Code Runner to complete the activity,
         * from the first import statement to the last bracket.
        */

        Scanner Scan = new Scanner(System.in);

        int input,
            sum = 0;

        int[] digits = new int[3];

        System.out.println("Please enter a three digit number:");
        input = Scan.nextInt();

        digits[0] = ((input) - (input % 100)) / 100;
        digits[1] = ((input % 100) - (input % 10)) / 10;
        digits[2] = (input % 10);

        System.out.println("Here are the digits: ");
        for(int i = 0; i < 3; i++)
            System.out.println(digits[i]);
        sum = digits[0] + digits[1] + digits[2];
        System.out.println(digits[0] + " + " + digits[1] + digits[2] + " + " + digits[2] + " = " + sum);


    }
}
