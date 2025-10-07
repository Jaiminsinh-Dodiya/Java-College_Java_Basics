// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;

class T5_Q48 
{
    public static void main(String f[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check:");
        int num = sc.nextInt();

        System.out.println("Enter lower limit:");
        int lower = sc.nextInt();

        System.out.println("Enter upper limit:");
        int upper = sc.nextInt();

        if (num > lower && num < upper) {
            System.out.println("The number is within the exclusive range.");
        } 
        else if (num >= lower && num <= upper) {
            System.out.println("The number is within the inclusive range.");
        } 
        else {
            System.out.println("The number is outside the range.");
        }
    }
}