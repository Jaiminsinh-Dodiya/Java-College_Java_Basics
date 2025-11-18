class temp1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 0; i<=5; i++)
			{
				System.out.println("Jaiminsinh Dodiya");
				Thread.sleep(2000);
			}
		}

		catch(Exception e)
		{
		}

	}
}

class E1
{
	public static void main(String g[])
	{
		temp1 t = new temp1();
		t.start();
	}
}