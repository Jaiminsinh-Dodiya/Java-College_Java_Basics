// Write a program to check if a character is Lowercase.

import java.util.Scanner;

class T4_Q10
{
    public static void main(String f[])
    {
        Scanner sc = new Scanner(System.in);
        
        char ch;

        ch = sc.next().charAt(0);
        if (Character.isLowerCase(ch))
        {
            System.out.println("Lowercase");
        }
        else
        {
            System.out.println("Not Lowercase");
        }
        
    }
}