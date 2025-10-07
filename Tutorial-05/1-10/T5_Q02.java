// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q02 
{
    public static void main(String f[] ) 
	{

        Scanner sc = new Scanner(System.in);
        String str1;
        String str2;

        System.out.print("Enter the first string: ");
        str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        str2 = sc.nextLine();

        if (str1.equalsIgnoreCase(str2))
	{
		System.out.println("String is equal (case-insensitive)");
    	} 
	else
	{
		System.out.println("String is not-equal (case-insensitive)");
        }
	}
}