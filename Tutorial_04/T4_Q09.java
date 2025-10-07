// Write a program to check if a character is uppercase.

import java.io.*;
import java.util.Scanner;

class T4_Q09
{
    public static void main(String f[])
    {
        Scanner sc = new Scanner(System.in);
        
        char ch;

        ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch))
        {
            System.out.println("Uppercase");
        }
        else
        {
            System.out.println("Not Uppercase");
        }
        
    }
}