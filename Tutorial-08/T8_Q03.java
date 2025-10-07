// Write a program to create a class Rectangle with length and breadth. Initialize them using a default constructor and display the area.

import java.util.Scanner;
class Rectangle
{
	int length, breadth;
	
	Rectangle()
	{
		length = 10;
		breadth = 5;
	}
	
	void area()
	{
		System.out.println("Area of Rectangle: " + (length * breadth));
	}	
}

class T8_Q03
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		Rectangle r1 = new Rectangle();
		
		r1.area();
	}

}