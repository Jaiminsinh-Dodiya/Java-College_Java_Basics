import java.io.*;

class T1 extends Thread
{
	public void run()
	{	
		System.out.println("MSG from Thread extends class");
	}
}

class E1
{
	public static void main(String h[])
	{
		T1 t1 = new T1();
		t1.start();
	}
}