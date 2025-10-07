// Marksheet with Grade using Nested if



import java.util.Scanner;

class Student
{
	Scanner sc = new Scanner(System.in);

	int r;	

	void input()
	{
		System.out.print("Enter the number: ");
		r = sc.nextInt();
	}

	void display()
	{
		System.out.println("Number :" + r);
		if(r >= 0)
		{
			if(r >= 60)
			{
				System.out.println("Grade: A");
			}
			else if(r >= 50)
			{
				System.out.println("Grade: B");
			}
			else if(r >= 40)
			{
				System.out.println("Grade: C");
			}
			else
			{
				System.out.println("Grade: D");
			}
		}
		else
		{
			System.out.println("Invalid input, number cannot be negative.");
		}
	}
}

class Q5
{
	public static void main(String g[])
	{
		Student s1 = new Student();
		s1.input();
		s1.display();
	}
}	