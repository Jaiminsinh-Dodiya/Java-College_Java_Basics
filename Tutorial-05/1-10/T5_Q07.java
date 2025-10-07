// User Input Accept marks and determine pass/fail (pass if >= 35).

import java.util.Scanner;
public class T5_Q07 {
    public static void main(String[] f) {

        Scanner sc = new Scanner(System.in);
        int marks;

        System.out.print("Enter the marks: ");
        marks = sc.nextInt();

        if (marks >= 35) {
            System.out.println("You have passed.");
        } else {
            System.out.println("You have failed.");
        }
    }
}