// Write a program to check if a person’s height is above 160 cm.

import java.util.Scanner;
class T4_Q24
{
    public static void main(String f[])
    {
        System.out.println("Jaiminsinh Dodiya");
        System.out.println("Division - B");
        System.out.println("Roll No: 06");

        Scanner sc = new Scanner(System.in);
        
        double height;

        System.out.print("Enter height in cm: ");
        height = sc.nextDouble();

        if (height > 160)
        {
            System.out.println("Height is above 160 cm");
        }
        else
        {
            System.out.println("Height is not above 160 cm");
        }
    }
}