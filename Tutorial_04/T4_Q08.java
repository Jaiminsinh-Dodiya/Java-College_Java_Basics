// Write a program to check if one number is greater than the other.

import java.io.*;
import java.util.Scanner;

class T4_Q08
{
    public static void main(String f[])
    {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 > num2)
        {
            System.out.println("First number is greater");
        }
        else if (num1 < num2)
        {
            System.out.println("Second number is greater");
        }
        else
        {
            System.out.println("Both numbers are equal");
        }
        
    }
}