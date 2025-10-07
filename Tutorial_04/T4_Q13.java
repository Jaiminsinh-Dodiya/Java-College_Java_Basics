// Write a program to check if a number is divisible by 3 and 5.

import java.util.Scanner;
class T4_Q13
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

        if (num % 3 == 0 && num % 5 == 0)
        {
            System.out.println("Divisible by both 3 and 5");
        }
        else
        {
            System.out.println("Not Divisible by both 3 and 5");
        }
    }
}