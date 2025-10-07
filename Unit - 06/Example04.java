import java.io.*;

class Example04
{
	public static void main(String args[])
	{
		int a = 10;

        try
        {
		a = a / 0;
		int [] b = new int[2];
		b [4] = 10;
		System.out.println(b);
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
		System.out.println("ArrayIndexOutOfBoundsException");
		System.out.println(e);
        }

        catch (ArithmeticException e)
        {
		System.out.println("ArithmeticException");
		System.out.println(e);
        }

        catch (Exception e)
        {
		System.out.println("Parent Exception");
		System.out.println(e);
        }
    }
}