// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q29
{
    public static void main(String f[]) 
    {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter age:");
        int age = sc.nextInt();

        if (age >= 60) 
	{
        	    System.out.println("Eligible for senior citizen scheme.");
        } 
	else 
	{
        	    System.out.println("Not eligible for senior citizen scheme.");
        }
    }
}

