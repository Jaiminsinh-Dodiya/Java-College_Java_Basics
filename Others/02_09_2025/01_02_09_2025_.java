import java.io.*;

class temp
{
	int a1;

	temp(int a)
	{
		a1 = a;
	}
		
	void Display()
	{
		for(int i = 1; i<=a1; i++)
		{
			System.out.println(i);
		}
	}
}

class MClass
{
	public static void main(String g[])
	{
		temp t = new temp(10);
		t.Display();
	}
}