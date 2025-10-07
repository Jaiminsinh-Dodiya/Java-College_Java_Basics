import java.io.*;

class temp
{
	int Roll;
	String Name;
	Float P;
	temp( int a, String b, float c)
	{
		Roll = a;
		Name = b;
		P = c;
	}
		
	void Display()
	{
		System.out.println("Roll no : " + Roll);
		System.out.println("Name : " + Name);
		System.out.println("Percentage : " + P);
	}
}

class MClass
{
	public static void main(String g[])
	{
		temp t = new temp();
		t.Display();
	}
}