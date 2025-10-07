import java.io.*;

abstract class flower
{
	abstract void show();
}

class lily extends flower
{
	void show()
	{
		System.out.println("Flower : Lily");
	}
}

class temp2	
{
	public static void main(String f[])
	{
		flower f1 = new lily();
		f1.show();
	}
}