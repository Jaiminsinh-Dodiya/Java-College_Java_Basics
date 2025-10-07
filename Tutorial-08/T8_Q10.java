// Create a class Rectangle with length and breadth. Use a parameterized constructor to initialize the values and calculate/display the area of the rectangle.

class Rectangle
{
	double length;
	double breadth;
	
	Rectangle(double l, double b)
	{
		length = l;
		breadth = b;
	}
	
	double area()
	{
		return length * breadth;
	}
	
	void display()
	{
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
		System.out.println("Area: " + area());
	}	
}
class T8_Q10
{
	public static void main(String s[])
	{
		Rectangle rect = new Rectangle(5.0, 3.0);
		
		rect.display();
	}

}