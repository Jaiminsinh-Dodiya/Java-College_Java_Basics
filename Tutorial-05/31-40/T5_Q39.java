// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;

class T5_Q39 {
    public static void main(String f[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three side lengths:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("The sides can form a triangle.");
        } else {
            System.out.println("Cannot form a triangle.");
        }
    }
}
