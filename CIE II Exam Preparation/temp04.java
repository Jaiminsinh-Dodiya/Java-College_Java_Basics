import java.io.*;
import java.util.Scanner;

class temp04
{
	public static void main(String h[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();

		int g[] = new int[n];
		System.out.println("Enter" + n + "Member");

		for(int i = 0; i<n; i++)
		{
			g[i] = sc.nextInt();
		}

		for(int i = n-1; i>=0; i--)
		{
			System.out.println(g[i]);
		}
	}
}