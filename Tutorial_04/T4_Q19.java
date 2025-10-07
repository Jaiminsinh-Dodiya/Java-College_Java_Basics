// Write a program to check if the length of a string is greater than 10.

import java.util.Scanner;
class T4_Q19
{
    public static void main(String f[])
    {
        System.out.println("Jaiminsinh Dodiya");
        System.out.println("Division - B");
        System.out.println("Roll No: 06");

        Scanner sc = new Scanner(System.in);
        
        String input;

        System.out.print("Enter a string: ");
        input = sc.nextLine();

        if (input.length() > 10)
        {
            System.out.println("String length is greater than 10");
        }
        else
        {
            System.out.println("String length is not greater than 10");
        }
    }
}