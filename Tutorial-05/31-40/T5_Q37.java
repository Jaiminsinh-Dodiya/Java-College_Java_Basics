// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;

class T5_Q37 
{

    public static void main(String f[]) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year:");
        int year = sc.nextInt();

        System.out.println("Enter month number (1-12):");
        int month = sc.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } 
		else if (month == 4 || month == 6 || month == 9 || month == 11) 
		{
            System.out.println("30 days");
        } 
		else if (month == 2) 
		{
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) 
			{
                System.out.println("29 days (leap year)");
            } 
			else 
			{
                System.out.println("28 days");
            }
        } 
		else 
		{
            System.out.println("Invalid month number");
        }
    }
}
