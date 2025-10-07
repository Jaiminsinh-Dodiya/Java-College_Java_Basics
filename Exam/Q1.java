import java.util.Scanner;
class Q1
{
	public static void main(String p[])
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int rollno;
		String EnNo;

		name = sc.nextLine();
		rollno = sc.nextInt();
		EnNo = sc.nextLine();

		System.out.println("Name : " + name);	
		System.out.println("Roll No : " + rollno);	
		System.out.println("Entrolment Number: " + EnNo);	
	}
}