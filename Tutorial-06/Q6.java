import java.io.*;
import java.util.Scanner;

class Student
{
	Scanner sc = new Scanner(System.in);

	int r;	

	void input()
	{
		System.out.println("Enter Number :");
		r = sc.nextInt();
	}

	void display()
	{
		System.out.println("Number :" + r);
		if(r>0)
		{
			System.out.println("Positive");
		}

		else
		{
			System.out.println("Negative");
		}
	}
}

class Q6
{
	public static void main(String g[])
	{
		Student s1 = new Student();
		s1.input();
		s1.display();
	}
}	