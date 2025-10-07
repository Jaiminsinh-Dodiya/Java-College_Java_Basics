
class temp
{
	int a;
	temp(int a)
	{
		this.a = a;
	}

	// Q7 : Input Year and check if leap year
	void checkLeapYear()
	{
		if((a%4==0 && a%100!=0) || (a%400==0))
			System.out.println(a+" is a Leap Year");
		else
			System.out.println(a+" is not a Leap Year");
	}

}

class MClass
{
	public static void main(String g[])
	{
		temp t = new temp(2026);
		t.checkLeapYear();
	}
}