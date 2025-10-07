//Comparing Operator

class LogiOpr
{
	public static void main(String p[])
	{
		int ab = 5;
		System.out.println("AND Operator : " + (ab > 5 && ab < 10));
		System.out.println("OR Operator : " + (ab > 5 || ab < 10));
		System.out.println("NO Operator : " + !(ab < 4));
	}
}