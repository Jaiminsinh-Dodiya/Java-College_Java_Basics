// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q32
{
	public static void main(String f[]) 
	{
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter marks (out of 100):");
        int marks = sc.nextInt();

        System.out.println("Enter attendance percentage:");
        int attendance = sc.nextInt();

        if (marks >= 75 && attendance >= 80)
	{
        	    System.out.println("Eligible for scholarship.");
        } 
	else 
	{
        	    System.out.println("Not eligible for scholarship.");
        }
    }

}

