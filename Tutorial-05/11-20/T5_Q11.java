// Check if a year is leap and also divisible by 400.

import java.util.Scanner;
public class T5_Q11
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        int year;

        System.out.print("Enter a year: ");
        year = sc.nextInt();

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}