// Write a program to check if two numbers are equal.

import java.io.*;
import java.util.Scanner;

class T4_Q07
{
    public static void main(String f[])
    {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        if (num1 == num2)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        
    }
}