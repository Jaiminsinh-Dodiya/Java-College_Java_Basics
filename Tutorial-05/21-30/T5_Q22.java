// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q22
{
     public static void main(String f[]) 
    {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter gender (M/F):");
        char gender = sc.next().charAt(0);


        if (gender == 'M' || gender == 'm')
	{
        	    System.out.println("Male");
        } 
	else if (gender == 'F' || gender == 'f') 
	{
        	    System.out.println("Female");
        } 
	else 
	{
        	    System.out.println("Invalid input");
        }
   }

}