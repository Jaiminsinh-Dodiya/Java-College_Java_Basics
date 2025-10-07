// Write a program to check if a character is a digit.

import java.util.Scanner;

class T4_Q11
{
    public static void main(String f[])
	{
		System.out.println("Jaiminsinh Dodiya");
		System.out.println("Division - B");
		System.out.println("Roll No: 06");

        Scanner sc = new Scanner(System.in);
		char ch;

		System.out.print("Enter a character: ");
		ch = sc.next().charAt(0);

		if (Character.isDigit(ch))
		{
			System.out.println("Digit");
		}

		else
		{
			System.out.println("Not Digit");
		}
    }
}