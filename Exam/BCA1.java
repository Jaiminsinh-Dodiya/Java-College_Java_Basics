// Example of Class and Object

// Write an Program using class
// class name is student and main class name is teacher.
// Create a member function which display roll no and name.

class Student
{
	void display()
	{
		System.out.println("Roll no : 06");
		System.out.println("Name : Jaimin");
	}
}

class Teacher
{
	public static void main(String g[])
	{
		Student s1 = new Student();
		s1.display();
	}
}