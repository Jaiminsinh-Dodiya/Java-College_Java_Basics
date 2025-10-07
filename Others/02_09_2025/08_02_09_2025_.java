
class temp
{
	int a;
	temp(int a)
	{
		this.a = a;
	}

	void Fibonacci()
	{        
		int n1=0, n2=1, n3;
		System.out.print(n1+" "+n2);
		for(int i=2; i<a; ++i)
		{
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}

}

class MClass
{
	public static void main(String g[])
	{
		temp t = new temp(5);
		t.Fibonacci();
	}
}