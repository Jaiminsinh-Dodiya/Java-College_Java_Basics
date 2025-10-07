import java.io.*;

class test
{
	int a = 10;
	static int b = 30;

	void show1()
	{
		System.out.println(a);
		System.out.println(b);
	}

	static void show2()
	{
		System.out.println(b);
	}

}

class mclass
{
	public static void main(String b[])
	{
		test t = new test();
		t.show1();
		t.show2();
		test.show2();
	}
}