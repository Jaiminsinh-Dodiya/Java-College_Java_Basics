// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;

class T5_Q41
{

    public static void main(String f[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.println("Enter digit to check:");
        int digit = sc.nextInt();

        if (num % 10 == digit) {
            System.out.println("The number ends with " + digit);
        } else {
            System.out.println("The number does not end with " + digit);
        }
    }
}