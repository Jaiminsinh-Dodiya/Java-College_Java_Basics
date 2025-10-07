//Exception Handling 
// Program 01: Arithmetic Exception
// java.lang.ArithmeticException : /Zero

import java.io.*;
class Example01
{
	public static void main(String d[])
	{
		int a = 10;		
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