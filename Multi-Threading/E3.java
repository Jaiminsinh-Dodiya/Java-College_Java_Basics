class temp1 extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println("BCA");
		}
	}
}

class E3
{
	public static void main(String g[])
	{
		temp1 t = new temp1();
		t.start();
	}
}