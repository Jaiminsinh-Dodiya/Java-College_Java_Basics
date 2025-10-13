import java.io.*;
import java.util.Scanner;

class main
{
	public static void main(String f[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number 1 : ");
		double a = sc.nextInt();

		System.out.println("Enter Number 2 : ");
		double b = sc.nextInt();
		double m,p;  

		m = a % b;
		p = Math.pow(a,b);

		System.out.println("Modulation of A & B :" + m);
		System.out.println("Power of A & B :" + p);
	
	}
}