// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q13
{
    public static void main(String[] d) 
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        // Check if the two numbers are equal
        if (num1 == num2) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }
    }
}