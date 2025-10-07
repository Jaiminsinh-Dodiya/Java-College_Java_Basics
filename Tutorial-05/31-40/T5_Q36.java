// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
class T5_Q37
{
	public static void main(String f[]) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a number:");
        int num = sc.nextInt();


        if (num >= -9 && num <= 9)
		{
        	System.out.println("Single-digit number.");
        } 
		else if ((num >= 10 && num <= 99) || (num <= -10 && num >= -99)) 
		{
            System.out.println("Two-digit number.");
        } 
		else 
		{
        	 System.out.println("Three-digit or more.");
        }
	}
}

