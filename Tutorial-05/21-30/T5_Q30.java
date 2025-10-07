// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q30
{
     public static void main(String f[]) 
    {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter marks for Subject 1:");
        int m1 = sc.nextInt();

        System.out.println("Enter marks for Subject 2:");
        int m2 = sc.nextInt();

        System.out.println("Enter marks for Subject 3:");
        int m3 = sc.nextInt();

        System.out.println("Enter marks for Subject 4:");
        int m4 = sc.nextInt();

        System.out.println("Enter marks for Subject 5:");
        int m5 = sc.nextInt();

        if (m1 >= 35 && m2 >= 35 && m3 >= 35 && m4 >= 35 && m5 >= 35) 
	{
        	    System.out.println("Pass in all subjects.");
        } 
	else 
	{
        	    System.out.println("Fail in one or more subjects.");
        }
    }
}

