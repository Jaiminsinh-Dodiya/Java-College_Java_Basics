import java.io.*;
import java.util.Scanner;

class Main
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
		if(r%2 == 0)
		{
			System.out.println("Even");
		}

		else
		{
			System.out.println("Odd");
		}	
	}
}

class Q3
{
	public static void main(String g[])
	{
		Main s1 = new Main();
		s1.input();
		s1.display();
	}
}	