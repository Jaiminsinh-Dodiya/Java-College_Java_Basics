// Multilevel Inheritance
// Method Overwriting.

class a
{
	void dis1()
	{
	System.out.println("A");
	}
}

class b extends a
{
	void dis2()
	{
	System.out.println("B");
	}
}

class c extends b
{
	void dis3()
	{
	System.out.println("C");
	}
}

class temp2
{
	public static void main(String f[])
	{
		c c1 = new c();
		c1.dis1();
		c1.dis2();
		c1.dis3();
	}
}
