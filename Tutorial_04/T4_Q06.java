// Write a program to check if a number is Odd.

import java.io.*;
import java.util.Scanner;

class T4_Q06
{
    public static void main(String f[])
    {
        Scanner sc = new Scanner(System.in);
        
        int number;

        number = sc.nextInt();
        if (number % 2 == 1)
        {
            System.out.println("Odd");
        }

    }
}