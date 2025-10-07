// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q25
{
	public static void main(String f[]) 
    {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter score:");
        int score = sc.nextInt();


        if (score >= 90) 
	{
		System.out.println("Grade: A");
	}
        else if (score >= 80) 
	{
		System.out.println("Grade: B");
	}
        else if (score >= 70) 
	{
		System.out.println("Grade: C");
	}
        else if (score >= 60) 
	{
		System.out.println("Grade: D");
	}
        else 
	{
		System.out.println("Grade: F");
	}
   }

}