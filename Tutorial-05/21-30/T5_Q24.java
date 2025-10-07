// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q24
{
	public static void main(String f[]) 
    	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number:");
        int num = sc.nextInt();

        if (num <= 1) 
	{	System.out.println("Not Prime");	}
 
	else if (num == 2 || num == 3 || num == 5 || num == 7) 
	{	System.out.println("Prime");	} 

	else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) 
	{	System.out.println("Not Prime");	} 

	else 
	{	System.out.println("Probably Prime");	}

	}
}