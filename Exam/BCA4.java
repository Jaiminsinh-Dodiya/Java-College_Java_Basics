// Write the programm in Java which use the concept of class and object and scanner class.

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
		if(r>10)
		{
			System.out.println("Less");
		}

		else if(r<10)
		{
			System.out.println("Greater");
		}

		else
		{
			System.out.println("Equal");
		}	
	}
}

class master
{
	public static void main(String g[])
	{
		Student s1 = new Student();
		s1.input();
		s1.display();
	}
}	