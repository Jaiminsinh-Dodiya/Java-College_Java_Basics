// Write a program to check if the entered grade is 'A'.

import java.util.Scanner;
class T4_Q21
{
    public static void main(String f[])
    {
        System.out.println("Jaiminsinh Dodiya");
        System.out.println("Division - B");
        System.out.println("Roll No: 06");

        Scanner sc = new Scanner(System.in);
        
        char grade;

        System.out.print("Enter a grade: ");
        grade = sc.next().charAt(0);

        if (grade == 'A')
        {
            System.out.println("Grade is A");
        }
        else
        {
            System.out.println("Grade is not A");
        }
    }
}