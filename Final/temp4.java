import jave.io.*;

final class Bike 
{
	final int speedLimit = 90;

	final void run() 
	{
		System.out.println("running");
	}
}
class Honda extends Bike 
{
	void run() 
	{
		speedLimit = 400;
		System.out.println("running safely with 100kmph");
	}
}

public class temp4 
{
	public static void main(String args[]) {
		Bike honda = new Bike();
		honda.run();
	}
}
