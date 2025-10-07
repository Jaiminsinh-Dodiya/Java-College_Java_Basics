// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q27
{
    public static void main(String f[]) 
    {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a float value:");
        float value = sc.nextFloat();


        if (value > 0) 
	{
        	    System.out.println("Positive number.");
        } 
	else if (value < 0) 
	{
        	    System.out.println("Negative number.");
        } 
	else 
	{
        	    System.out.println("Zero.");
        }
    }

}

