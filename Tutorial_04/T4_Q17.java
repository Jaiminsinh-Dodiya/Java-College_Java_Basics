// Write a program to check if a string is equal to "Java".

import java.util.Scanner;
class T4_Q17
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

        if (input.equals("Java"))
        {
            System.out.println("String is equal to 'Java'");
        }
        else
        {
            System.out.println("String is not equal to 'Java'");
        }
    }
}