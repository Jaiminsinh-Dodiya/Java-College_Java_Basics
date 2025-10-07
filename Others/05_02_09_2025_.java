// Q5 : Even Odd
// Q6 : Factorial 
// Q7 : Input Year and check if leap year
// Q8 : Start Pattern
// Q9 : Fibonacci Series
// Q10 : Table Print of Number

class temp
{
	int r;
	temp( int r)
	{
		this.r = r;
	}

	// Even Odd
	void evenOdd()
	{
		if(r%2==0)
			System.out.println(r+" is Even");
		else
			System.out.println(r+" is Odd");
	}
}

class MClass
{
	public static void main(String g[])
	{
		temp t = new temp(10);
		t.evenOdd();
	}
}