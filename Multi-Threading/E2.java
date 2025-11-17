import java.io.*;

class T extends Thread
{
	public void run()
	{	
		System.out.println("BCA");
		System.out.println("Name : Jaiminsinh Dodiya");
		System.out.println("Roll No : 06");
	}
}

class E1
{
	public static void main(String h[])
	{
		T t1 = new T();
		t1.start();
	}
}