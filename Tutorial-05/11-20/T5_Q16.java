// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q16
{
    public static void main(String[] f) 
    {
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        // Check if the age is eligible for a driving license
        if (age >= 18) {
            System.out.println("You are eligible for a driving license.");
        } else {
            System.out.println("You are not eligible for a driving license.");
        }
    }
}