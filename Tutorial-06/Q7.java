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
		for (int i = 1; i <= r; i++) 
		{
            		for (int j = 1; j <= i; j++) 
			{
                		System.out.print("* ");
            		}
            	System.out.println();
        	}
	}
}

class Q7
{
	public static void main(String g[])
	{
		Main s1 = new Main();
		s1.input();
		s1.display();
	}
}	