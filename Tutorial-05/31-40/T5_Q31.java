// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q31
{
	public static void main(String f[]) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
        	int num = sc.nextInt();

        	if (num % 2 == 0 && num % 10 == 0) 
		{
        	    System.out.println("The number is even and a multiple of 10.");
        	} 
		else 
		{
        	    System.out.println("The number does not meet both conditions.");
        	}
    	}
}

