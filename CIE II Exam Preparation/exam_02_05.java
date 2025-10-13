import java.util.Scanner;

class Exam_02_05
{
	public static void main(String d[])
	{
		int a = 2;
		int b = 0;
		int c = 0;
		try
		{
			c = a / b;
			System.out.println("Result of Division : " + c);
		}

		catch(Exception e)
		{
			System.out.println("Not Allowed!");
		}

		finally
		{
			System.out.println("Execution Completed (Finally block completed)");
		}
	}
}