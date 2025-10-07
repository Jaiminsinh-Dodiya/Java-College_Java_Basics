import java.io.*;
import java.util.Scanner;

class Employee
{
	int id;
	String name;
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee ID: ");
		id = sc.nextInt();
		
		System.out.print("Enter Employee Name: ");
		name = sc.next();
	}
	
	void display()
	{
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
	}	
}

class T8_Q02
{
	public static void main(String s[])
	{
		Employee e1 = new Employee();
		
		e1.input();
		e1.display();
	}

}