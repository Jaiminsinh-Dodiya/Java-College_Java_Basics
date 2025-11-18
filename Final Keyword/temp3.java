// Example of Final Memnber
// Error : Cannot inheritance from Final Class/Method/Member

import java.io.*;

class animal
{
	final int = 10;
}

class cat extends animal
{
	void show()
	{
		
		System.out.println("Cat is cute");
		a = 11;
	}
}

class temp03
{
	public static void main(String f[])
	{
		animal a = new animal();
		a.show();
	}
}
