// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q21
{
     public static void main(String f[]) 
    {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number:");
        int num = sc.nextInt();


        if (num % 4 == 0 && num % 6 == 0) 
	{
		System.out.println("The number is a multiple of both 4 and 6.");
        }
	else 
	{
		System.out.println("The number is NOT a multiple of both 4 and 6.");
        }
   }

}