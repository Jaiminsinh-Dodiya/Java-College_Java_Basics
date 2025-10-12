// The abstract class with a general-purpose abstract method.
abstract class Shape 
{
	String color;
	Shape(String color) 
	{
		this.color = color;
	}

    	// A better name for an abstract method that all shapes should have.
	abstract double calculateArea();
}


// The class name is corrected, and it now calculates the area of a triangle.
// A triangle needs a base and a height, not a radius.
final class Triangle extends Shape 
{
	double base;
	double height;
	
	Triangle(String color, double base, double height) 
	{
		super(color);
        	this.base = base;
        	this.height = height;
	}

    // The method is correctly named and implements the correct formula for a triangle's area.
    @Override
    public double calculateArea() {
        return 0.5 * base * height; // Formula for a triangle's area
    }
}


// The main class name follows Java conventions.
class ShapeDemo {
    public static void main(String[] args) {
        // We now pass the base and height to the constructor.
        Triangle t1 = new Triangle("Red", 10, 5);

        // The output message is updated to be accurate.
        System.out.println("Area of the Triangle is: " + t1.calculateArea());
    }
}