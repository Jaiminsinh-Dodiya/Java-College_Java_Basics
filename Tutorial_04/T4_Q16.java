// Write a program to check if a number is greater than 1000.

import java.util.Scanner;
class T4_Q16
{
    public static void main(String f[])
    {
        System.out.println("Jaiminsinh Dodiya");
        System.out.println("Division - B");
        System.out.println("Roll No: 06");

        Scanner sc = new Scanner(System.in);
        
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if (num > 1000)
        {
            System.out.println("Number is greater than 1000");
        }
        else
        {
            System.out.println("Number is not greater than 1000");
        }
    }
}