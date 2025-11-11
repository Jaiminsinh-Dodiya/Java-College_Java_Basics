import java.io.*;

class E5
{

public static void main(String g[])
{
	double a = Double.parseDouble(g[0]);
	double b = Double.parseDouble(g[1]);
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