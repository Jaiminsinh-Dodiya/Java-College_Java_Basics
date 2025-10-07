// Check if a number lies between two other numbers.
// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q19
{
    public static void main(String[] f) 
    {
        Scanner sc = new Scanner(System.in);
        int number, lowerBound, upperBound;

        System.out.print("Enter a number: ");
        number = sc.nextInt();
        
        System.out.print("Enter lower bound: ");
        lowerBound = sc.nextInt();
        
        System.out.print("Enter upper bound: ");
        upperBound = sc.nextInt();

        if (number > lowerBound && number < upperBound) {
            System.out.println(number + " lies between " + lowerBound + " and " + upperBound + ".");
        } else {
            System.out.println(number + " does not lie between " + lowerBound + " and " + upperBound + ".");
        }
    }
}