// Create a class Student with id and name. Use a parameterized constructor to initialize these values and display the student details.

import java.util.Scanner;

class m
{
	int id;
	String name;

	m(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	void display()
	{
		System.out.println("Student ID :" + id);
		System.out.println("Student Name :" + name);
	}
}

class temp03
{
	public static void main(String g[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ID");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter name");
		String name = sc.nextLine();

		m main = new m(id,name);
		main.display();
	}
}