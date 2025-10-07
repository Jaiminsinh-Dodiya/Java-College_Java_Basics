import java.io.*;
import java.util.Scanner;

class test
{
	int id;
	String name;

	test(int i, String n)
	{
		id = i;
		name = n;
	}

	void display()
	{
		System.out.println("Name : " + name + "\nID : " + id);	
	}	
}

class main
{
	public static void main(String s[])
	{
		test t1 = new test(1, "Jaimin");
		t1.display();
	}
}