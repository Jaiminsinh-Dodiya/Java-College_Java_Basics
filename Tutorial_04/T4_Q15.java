//Write a program to check if the temperature is above 100 (fever condition).

import java.util.Scanner;
class T4_Q15
{
    public static void main(String f[])
    {
        System.out.println("Jaiminsinh Dodiya");
        System.out.println("Division - B");
        System.out.println("Roll No: 06");

        Scanner sc = new Scanner(System.in);
        
        double temperature;

        System.out.print("Enter temperature in Celsius: ");
        temperature = sc.nextDouble();

        if (temperature > 100)
        {
            System.out.println("Fever condition detected");
        }
        else
        {
            System.out.println("No fever");
        }
    }
}