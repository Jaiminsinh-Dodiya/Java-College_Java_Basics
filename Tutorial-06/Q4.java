import java.io.*;
import java.util.Scanner;

class Main
{
	Scanner sc = new Scanner(System.in);

	int year;	

	void input()
	{
		System.out.println("Enter Year :");
		year = sc.nextInt();
	}

	void display()
	{
		System.out.println("Year :" + year);
		if(year % 4 == 0 && year % 100 != 0)			
		{
			System.out.println("Leap Year");
		}

		else
		{
			System.out.println("Not Leap Year");
		}	
	}
}

class Q4
{
	public static void main(String g[])
	{
		Main s1 = new Main();
		s1.input();
		s1.display();
	}
}	