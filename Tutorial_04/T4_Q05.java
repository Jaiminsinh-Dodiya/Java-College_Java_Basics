// Write a program to check if a number is even.

import java.io.*;
import java.util.Scanner;

class T4_Q05
{
    public static void main(String f[])
    {
        Scanner sc = new Scanner(System.in);
        
        int number;

        number = sc.nextInt();
        if (number % 2 == 0)
        {
            System.out.println("Even");
        }

        else
        {
            System.out.println("Odd");
        }
        
    }
}