import java.util.Scanner;

class Exam_02_03
{
	public static void main(String d[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int f = 0;
		for(int i = 0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
				f++;
			}
		}

		System.out.println(f);
	}
}