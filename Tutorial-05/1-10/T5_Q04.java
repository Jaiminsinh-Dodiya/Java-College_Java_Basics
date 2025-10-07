// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.io.*;
import java.util.Scanner; 


class T5_Q04
{
    public static void main(String f[]) 
    {
		
	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0 && number % 2 == 0) 
	{
         	  System.out.println(number + " is positive and even.");
        } 
	else
	{
	           System.out.println(number + " is NOT positive and even.");
        }

     }


}
