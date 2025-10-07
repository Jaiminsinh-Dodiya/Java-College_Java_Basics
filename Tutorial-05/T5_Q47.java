// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;

class T5_Q47 
{
    public static void main(String f[]) 
    {
        Scanner sc = new Scanner(System.in);
        final int average = 40;

        System.out.println("Enter student score:");
        int score = sc.nextInt();

        if (score > average) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}