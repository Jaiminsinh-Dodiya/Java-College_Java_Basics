// Write a program to create a class Car with brand and year. Initialize using default constructor and display the car details.
class Car
{
	String brand;
	int year;
	
	Car()
	{
		brand = "Toyota";
		year = 2020;
	}
	
	void display()
	{
		System.out.println("Car Brand: " + brand);
		System.out.println("Car Year: " + year);
	}	
}

class T8_Q07
{
	public static void main(String s[])
	{
		Car c1 = new Car();
		
		c1.display();
	}

}