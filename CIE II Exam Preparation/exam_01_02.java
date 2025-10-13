import java.util.Scanner;

class Exam_01_02
{
	public static void main(String d[])
	{
		int n = 10;

		int f = 0;
		int s = 1;
		for(int i = 0; i<=n; i++)
		{
			System.out.print(f + " ");
			int next = f + s;
			f = s;
			s = next;
		}
	}
}