import java.io.*;
import java.util.Scanner;

class teacher
{
	int id;
	teacher(int id)
	{
		this.id = id;
	}
}

class Student extends teacher
{
	student(int id)
	{
		super(id);
	}

	void display()
	{
		System.out.println(id);
	}
}

class TEMP4
{
	public static void main(String s[])
	{
        	Scanner sc = new Scanner(System.in);

	        System.out.print("Enter ID: ");
        	int i = sc.nextInt();

		student s = new Student(i);
		s.display();
	}
}