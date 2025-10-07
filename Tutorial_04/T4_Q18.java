// Write a program to check if an employee is eligible for a bonus (years of service ≥ 5).

import java.util.Scanner;
class T4_Q18
{
    public static void main(String f[])
    {
        System.out.println("Jaiminsinh Dodiya");
        System.out.println("Division - B");
        System.out.println("Roll No: 06");

        Scanner sc = new Scanner(System.in);
        
        int yearsOfService;

        System.out.print("Enter years of service: ");
        yearsOfService = sc.nextInt();

        if (yearsOfService >= 5)
        {
            System.out.println("Eligible for bonus");
        }
        else
        {
            System.out.println("Not eligible for bonus");
        }
    }
}