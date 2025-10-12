class Car
{
	static int CarIndex = 0;
	String brand;
	String model;

	Car(String brand, String model)
	{
		this.brand = brand;
		this.model = model;
		CarIndex++;
	}
}

class temp07
{
	public static void main(String d[])
	{
		Car c1 = new Car("BMW", "M4");
		Car c2 = new Car("Ford", "Mustang");
		Car c3 = new Car("Fararri", "F40");

		System.out.println("Total Numbers of Cars : " + Car.CarIndex);
	}
}