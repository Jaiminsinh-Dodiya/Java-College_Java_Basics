// Write a program to check if a person is eligible to vote (age ≥ 18).

import java.io.*;
import java.util.Scanner;


class T4_Q04
{
    public static void main(String f[])
    {
        Scanner sc = new Scanner(System.in);
        
        int age;

        age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }
        
    }
}