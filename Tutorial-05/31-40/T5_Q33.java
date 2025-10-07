// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q33
{
	public static void main(String f[]) 
	{
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) 
	{
        	    System.out.println("One number is a factor of the other.");
        } 
	else 
	{
        	    System.out.println("Neither number is a factor of the other.");
        }
    }
}

