class temp1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			int t = 5 * i;
			System.out.println("5 x " + i + " = " + t);
		}
	}
}

class E4
{
	public static void main(String g[])
	{
		temp1 t = new temp1();
		t.start();
	}
}