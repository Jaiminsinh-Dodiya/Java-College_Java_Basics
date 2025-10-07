import java.util.Scanner;

class Vowel
{
	public static void main(String p[])
	{
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter Character:");
		ch = sc.nextLine();

		if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U')
		{
			System.out.println(ch + " is a Vowel");
		}
		else
		{
			System.out.println(ch + " is a Constant");
		}
	}
}