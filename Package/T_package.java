class temp1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			try
			{
				for(int i = 0; i<=5; i++)
				{
					System.out.println("BCA");
					Thread.sleep(2000);
				}
			}

			catch(Exception e)
			{}
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