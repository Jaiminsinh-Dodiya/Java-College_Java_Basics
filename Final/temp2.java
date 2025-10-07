// Example of Final Class
// Error : Cannot inheritance from Final Class/Method/Member

import java.io.*;

class animal
{
	final void show()
	{
		System.out.println("Cat is cute");
	}

}

class cat extends animal
{
	void show()
	{
		System.out.println("Cat is cute");
	}
}

class temp02
{
	public static void main(String f[])
	{
		animal a = new animal();
		a.show();
	}
}
