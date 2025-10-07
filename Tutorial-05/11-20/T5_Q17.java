// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q17 
{
    public static void main(String[] g) 
    {
        Scanner sc = new Scanner(System.in);
        double salary;

        System.out.print("Enter your salary: ");
        salary = sc.nextDouble();

        // Determine the tax bracket based on salary
        if (salary <= 250000) {
            System.out.println("You are in the 0% tax bracket.");
        } else if (salary <= 500000) {
            System.out.println("You are in the 5% tax bracket.");
        } else if (salary <= 1000000) {
            System.out.println("You are in the 20% tax bracket.");
        } else {
            System.out.println("You are in the 30% tax bracket.");
        }
    }
}