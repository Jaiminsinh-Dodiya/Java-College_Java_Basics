// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q06 {
    public static void main(String[] f) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        num3 = sc.nextInt();


        if (num1 <= num2 && num1 <= num3) {
            System.out.println("The smallest number is: " + num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("The smallest number is: " + num2);
        } else {
            System.out.println("The smallest number is: " + num3);
        }
    }
}