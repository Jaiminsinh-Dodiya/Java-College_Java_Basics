// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;

class T5_Q43
{
    public static void main(String f[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee age:");
        int age = sc.nextInt();

        System.out.println("Enter years of service:");
        int service = sc.nextInt();

        if (age >= 60 || service >= 30) {
            System.out.println("Eligible for retirement.");
        } 
        else {
            System.out.println("Not eligible for retirement.");
        }
    }

}
