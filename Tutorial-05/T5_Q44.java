// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;

class T5_Q44 
{
    public static void main(String f[]) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        float temp = sc.nextFloat();

        if (temp < 35.0) {
            System.out.println("Hypothermia warning!");
        } else if (temp > 37.5) {
            System.out.println("Fever detected!");
        } else {
            System.out.println("Normal body temperature.");
        }
    }
}