import java.util.Scanner;
class Circle
{
	int radius;
	
	Circle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius of Circle: ");
		radius = sc.nextInt();
	}
	
	void area()
	{
		System.out.println("Area of Circle: " + (3.14 * radius * radius));
	}	
}

class T8_Q04
{
	public static void main(String s[])
	{
		Circle c1 = new Circle();
		
		c1.area();
	}

}