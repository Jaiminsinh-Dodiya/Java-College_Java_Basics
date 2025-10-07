
import java.io.*;
import java.util.Scanner;


class S_Test
{
    public static void main(String f[])
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int r;

		System.out.println("Enter Name:");
		name = sc.nextLine();

		System.out.println("Enter Roll:");
		r = sc.nextInt();


		System.out.println("Roll Number: " + r);
		System.out.println("Name: " + name);
	}
}
