// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;

public class T5_Q05 
{
    public static void main(String[] f) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();
        
	if(n % 2 != 0 && n > 100)
	{
		System.out.println(n +"is the number odd and greater than 100");
	}

	else
	{
	        System.out.println(n +"is not the number odd and greater than 100");
	}
        
    }
}