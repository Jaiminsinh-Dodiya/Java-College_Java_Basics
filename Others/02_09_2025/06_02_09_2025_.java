import java.io.*;

class temp
{
	int j;
	temp(int j)
	{
		this.j = j;
	}

	
	void factorial()
	{
		int f = 1;
		for(int i=1; i<=j; i++)
			f = f*i;
		System.out.println("Factorial of "+j+" is "+f);
	}
}

class MClass
{
	public static void main(String g[])
	{
		temp t = new temp(5);
		t.factorial();
	}
}