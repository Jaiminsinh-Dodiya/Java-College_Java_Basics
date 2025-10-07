// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;

class T5_Q49 
{

    public static void main(String f[]) 
	{

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks:");
        int marks = sc.nextInt();

        if (marks >= 75) {
            System.out.println("Distinction");
        } 
		else if (marks >= 60) {
            System.out.println("First Class");
        } 
		else if (marks >= 50) {
            System.out.println("Second Class");
        } 
		else if (marks >= 35) {
            System.out.println("Pass Class");
        } 
		else {
            System.out.println("Fail");
        }

    }

}
