// Take a month number and print the number of days.

import java.util.Scanner;
public class T5_Q10 {
    public static void main(String[] f) {

        Scanner sc = new Scanner(System.in);
        int month;

        System.out.print("Enter the month number (1-12): ");
        month = sc.nextInt();

        // with if else
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Number of days: 31");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Number of days: 30");
        } else if (month == 2) {
            System.out.println("Number of days: 28 (29 in leap years)");
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }
}