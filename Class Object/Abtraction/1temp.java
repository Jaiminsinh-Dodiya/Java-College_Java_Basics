import java.io.*;

abstract class A
{
	abstract void show();
}

class B extends A
{
	void show()
	{
		System.out.println("Jaminsinh Dodiya");
	}
}

class temp1	
{
	public static void main(String f[])
	{
		A a1 = new B();
		a1.show();
	}
}