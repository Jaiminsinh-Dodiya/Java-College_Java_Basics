// Write a program to check if a student passed (marks ≥ 40).

import java.util.Scanner;
class T4_Q14
{
    public static void main(String f[])
    {
        System.out.println("Jaiminsinh Dodiya");
        System.out.println("Division - B");
        System.out.println("Roll No: 06");

        Scanner sc = new Scanner(System.in);
        
        int marks;

        System.out.print("Enter marks: ");
        marks = sc.nextInt();

        if (marks >= 40)
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
    }
}