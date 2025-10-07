// Accept 4 numbers and find the greatest.

import java.util.Scanner;
public class T5_Q20
{
    public static void main(String[] h) 
    {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
        
        System.out.print("Enter third number: ");
        num3 = sc.nextInt();
        
        System.out.print("Enter fourth number: ");
        num4 = sc.nextInt();

        // Find the greatest number
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }

        System.out.println("The greatest number is: " + max);
    }
}