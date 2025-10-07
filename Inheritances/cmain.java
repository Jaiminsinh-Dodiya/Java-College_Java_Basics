import java.io.*;
import java.util.Scanner;

class teacher
{
	int p,r,n;
	teacher(int p, int r, int n)
	{
		this.p = p;
		this.r = r;
		this.n = n;
	}
}

class student
{
	student(int p, int r, int n)
	{
		super(p);
		super(r);
		super(n);
	}

	void show()
	{
		System.out.println(p);
	}
}

class cmain
{
	public static void main(String q[])
	{
		student s = new Student(p,r,n);
	}
}