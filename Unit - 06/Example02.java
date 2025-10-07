//Exception Handling 
// Program 02: Arithmetic Exception
// java.lang.ArithmeticException : /Zero

import java.util.Scanner;

class Example02
{
	public static void main(String d[])
	{
		int a;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Value");
		a = sc.nextInt();
		
		try
		{
			System.out.println(a/0);
		}

		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}