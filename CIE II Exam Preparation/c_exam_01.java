// Write a Program to check if the number is even or odd by if else


import java.util.Scanner;
class m
{
	public static void main(String g[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n % 2 == 0)
		{
			System.out.println("Even!");
		}

		else 
		{
			System.out.println("Odd!")
		}
	}
}