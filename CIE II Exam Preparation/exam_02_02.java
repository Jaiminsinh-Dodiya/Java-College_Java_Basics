class Student
{
	String name;
	int mark;
	
	Student(String n, int m)
	{
		name = n;
		mark = m;
	}

	void showdetailes()
	{
		System.out.println("Student Name : " + name);
		System.out.println("Student Mark : " + mark);
	}
}

class Exam_02_02
{
	public static void main(String g[])
	{
		Student s1 = new Student("Jaimin", 95);
		s1.showdetailes();
	}
}