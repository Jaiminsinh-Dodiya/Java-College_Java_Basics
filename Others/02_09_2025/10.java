
class temp
{
	int a;
	temp(int a)
	{
		this.a = a;
	}

    	void Table()
    	{
        	for(int i=1; i<=10; i++)
        	{
            		System.out.println(a + " * " + i + " = " + (a*i));
        	}
    	}
}

class MClass
{
	public static void main(String g[])
	{
		temp t = new temp(5);
        	t.Table();
	}
}