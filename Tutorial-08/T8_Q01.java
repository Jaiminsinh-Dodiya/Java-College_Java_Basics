// Jaiminsinh Dodiya, 3BCA-B, Roll no: 06
import java.util.Scanner;

class Student
{
	int id;
	String name;
	
	Student()
	{
		id = 101;
		name = "Jaimin";
	}

	void print()
	{
		
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
	}	
}



class T8_Q01
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		
		s1.print();
	}

}