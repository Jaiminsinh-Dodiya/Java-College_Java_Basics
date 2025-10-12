import java.io.*;
import java.util.Scanner;

class temp04
{
	public static void main(String h[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of Array");
		int n = sc.nextInt();

		int a[] = new int[n];
		int b[] = new int[n];
		System.out.println("Enter" + n + "Member");

		for(int i = 0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}

		for(int i = 0; i<n; i++)
		{
			b[i] = a[i];
			System.out.println(b[i]);
		}
	}
}