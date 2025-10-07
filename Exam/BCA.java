// Example of Class and Object

class BCA_3B
{
	void display()
	{
		int a = 21;
		System.out.println(a+a);
	}
}

class BCA
{
	public static void main(String g[])
	{
		BCA_3B b1 = new BCA_3B();
		BCA_3B b2 = new BCA_3B();
		b1.display();
		b2.display();
	}
}