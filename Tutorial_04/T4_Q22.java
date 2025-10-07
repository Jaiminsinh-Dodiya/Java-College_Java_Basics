// Write a program to check if a year is greater than 2000.

import java.util.Scanner;
class T4_Q22
{
    public static void main(String f[])
    {
        System.out.println("Jaiminsinh Dodiya");
        System.out.println("Division - B");
        System.out.println("Roll No: 06");

        Scanner sc = new Scanner(System.in);
        
        int year;

        System.out.print("Enter a year: ");
        year = sc.nextInt();

        if (year > 2000)
        {
            System.out.println("Year is greater than 2000");
        }
        else
        {
            System.out.println("Year is not greater than 2000");
        }
    }
}