// Write a program to check if the value of a variable is between 1 and 100.

import java.util.Scanner;
class T4_Q25
{
    public static void main(String f[])
    {
        System.out.println("Jaiminsinh Dodiya");
        System.out.println("Division - B");
        System.out.println("Roll No: 06");

        Scanner sc = new Scanner(System.in);
        
        int value;

        System.out.print("Enter a number: ");
        value = sc.nextInt();

        if (value >= 1 && value <= 100)
        {
            System.out.println("Value is between 1 and 100");
        }
        else
        {
            System.out.println("Value is not between 1 and 100");
        }
    }
}