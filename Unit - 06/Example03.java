// Every type of Array Declare
// java.lang.ArrayIndexOutOfBoundException

import java.io.*;

class Example03
{
	public static void main(String args[])
	{
		int [] s1 = new int[3];

		try
		{
			s1[4] = 10;
		}
	
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}