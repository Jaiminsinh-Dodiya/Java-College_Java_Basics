// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;

class T5_Q40 {

    public static void main(String f[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate:");
        int x = sc.nextInt();
        System.out.println("Enter y coordinate:");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1st Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("2nd Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd Quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("4th Quadrant");
        } else if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("On Y-axis");
        } else {
            System.out.println("On X-axis");
        }
    }
}