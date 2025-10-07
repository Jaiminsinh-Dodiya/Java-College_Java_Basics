//Create a class Laptop with model and price. Initialize them using a default constructor and display details after taking user input with Scanner.

import java.util.Scanner;
class Laptop
{
	String model;
	int price;
	
	Laptop()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Laptop Model: ");
		model = sc.nextLine();
		
		System.out.print("Enter Laptop Price: ");
		price = sc.nextInt();
	}
	
	void display()
	{
		System.out.println("Laptop Model: " + model);
		System.out.println("Laptop Price: " + price);
	}	
}

class T8_Q05
{
	public static void main(String s[])
	{
		Laptop l1 = new Laptop();
		
		l1.display();
	}

}