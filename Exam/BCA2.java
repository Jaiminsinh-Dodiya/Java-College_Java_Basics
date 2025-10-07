// Write the programm in Java which use the concept of class and object and scanner class.
// class name is student and teacher display using member function roll no and name.

import java.io.*;
import java.util.Scanner;
class Student
{
	Scanner sc = new Scanner(System.in);

	int r;	
	String n;

	void input()
	{
		System.out.println("Enter Name :");
		n = sc.nextLine();

		System.out.println("Enter Roll Number :");
		r = sc.nextInt();
	}

	void display()
	{
		System.out.println("Roll Number :" + r);
		System.out.println("Name :" + n);
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