// Multilevel Inheritance
// Method Overwriting.

class a
{
	void dis()
	{
	System.out.println("A");
	}
}

class b extends a
{
	void dis()
	{
	System.out.println("B");
	}
}

class c extends b
{
	void dis()
	{
	System.out.println("C");
	}
}

class temp1
{
	public static void main(String f[])
	{
	c c1 = new c();
	c1.dis();
	}
}
