
class temp
{
	int a;
	temp(int a)
	{
		this.a = a;
	}

	void Pattern()
	{        
        for (int i = 1; i <= a; i++) 
		{
            		for (int j = 1; j <= a - i; j++) 
			{
                		System.out.print("  ");
            		}
		
           		for (int k = 1; k <= i; k++) 
			{
                		System.out.print("* ");
            		}
            		System.out.println();
       		}
	}
}

class MClass
{
	public static void main(String g[])
	{
		temp t = new temp(5);
		t.Pattern();	
	}
}