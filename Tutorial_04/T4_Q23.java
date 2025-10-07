// Write a program to check if a student’s score is less than 35 (fail condition).

import java.util.Scanner;
class T4_Q23
{
    public static void main(String f[])
    {
        System.out.println("Jaiminsinh Dodiya");
        System.out.println("Division - B");
        System.out.println("Roll No: 06");

        Scanner sc = new Scanner(System.in);
        
        int score;

        System.out.print("Enter score: ");
        score = sc.nextInt();

        if (score < 35)
        {
            System.out.println("Fail condition detected");
        }
        else
        {
            System.out.println("Pass condition");
        }
    }
}