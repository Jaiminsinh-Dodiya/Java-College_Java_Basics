// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q34
{
	public static void main(String f[]) 
	{
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter day number (1-7):");
        int day = sc.nextInt();

        if (day == 1 || day == 7) 
	{
        	    System.out.println("Weekend");
        } 
	else if (day >= 2 && day <= 6) 
	{
        	    System.out.println("Weekday");
        } 
	else 
	{
        	    System.out.println("Invalid day number");
        }
    }
}

