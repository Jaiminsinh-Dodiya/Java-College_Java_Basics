// Write a program to check if the salary is greater than 50,000.

import java.util.Scanner;
class T4_Q20
{
    public static void main(String f[])
    {
        System.out.println("Jaiminsinh Dodiya");
        System.out.println("Division - B");
        System.out.println("Roll No: 06");

        Scanner sc = new Scanner(System.in);
        
        double salary;

        System.out.print("Enter the salary: ");
        salary = sc.nextDouble();

        if (salary > 50000)
        {
            System.out.println("Salary is greater than 50,000");
        }
        else
        {
            System.out.println("Salary is not greater than 50,000");
        }
    }
}