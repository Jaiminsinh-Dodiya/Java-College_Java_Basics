import java.io.*;

class temp
{
	int t;
	temp(int t)
	{
		this.t = t;
	}

	void display()
	{
		System.out.println(t);
	}
}

class MClass
{
	public static void main(String h[])
	{
		temp i = new temp(50);
		i.display();
	}
}