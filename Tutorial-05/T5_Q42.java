// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;

class T5_Q42 
{

    public static void main(String f[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Divisible by both 2 and 3.");
        } else if (num % 2 == 0) {
            System.out.println("Divisible by 2 only.");
        } else if (num % 3 == 0) {
            System.out.println("Divisible by 3 only.");
        } else {
            System.out.println("Not divisible by 2 or 3.");
        }
    }
}