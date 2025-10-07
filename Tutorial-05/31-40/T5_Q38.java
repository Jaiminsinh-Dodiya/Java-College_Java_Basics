// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;

class T5_Q38
{

    public static void main(String f[]) 
    {
	
	Scanner sc = new Scanner(System.in);
	
	String validUser = "Jaimin";
        String validPass = "0007";


        System.out.println("Enter username:");
        String user = sc.nextLine();


        System.out.println("Enter password:");
        String pass = sc.nextLine();


        if (user.equals(validUser) && pass.equals(validPass)) 
	{
        	    System.out.println("Login successful!");
        } 
	else 
	{
        	    System.out.println("Invalid credentials.");
        }
    }

}
