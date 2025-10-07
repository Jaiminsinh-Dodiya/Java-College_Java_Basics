//Unit Name : Inheritances

//Single Inheritance
//Multilevel
//Hierarchical
//Hybrid
//Multiple

// Single Inheritance. means there is one base class and one child class. Child class can access all the property of base class.

import java.io.*;
class warehouse
{
	int a = 10;
}

class shop extends warehouse
{
	void show()
	{
		System.out.println(a);
	}
}

class temp1
{
	public static void main(String g[])
	{
		shop s = new shop();
		s.show();
	}
}