import java.io.*;
import java.util.Scanner;

class E2
{

public static void main(String g[])
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Value of A:");
	int a = sc.nextInt();

	System.out.println("Enter Value of B:");
	int b = sc.nextInt();
	int k[] = new int[3];

	try
	{
		System.out.println("Answers: " +(a/b));
		try
		{
			k[4] = 12;
			System.out.println("Error:" + k[4]);
		}

		catch(Exception e1)
		{
			System.out.println(e1);
			k[1] = 12;
	
			System.out.println("True Answer : " + k[1]);
		}
	}

	catch(Exception e2)
	{
		System.out.println(e2);
	}

	finally
	{
		System.out.println("Server down Page not found");
	}
}
}