//User Input Compare two strings for equality (case-sensitive) with if else statement.

import java.util.Scanner;

public class T5_Q01 {
    public static void main(String[] f) {

	Scanner sc = new Scanner (System.in);
        String s1;
        String s2;

        System.out.print("Enter the first string: ");
        s1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        s2 = sc.nextLine();

        boolean r;
        if (s1.equals(s2)){
		System.out.println("Equals");
        } 
	else {
		System.out.println("Not Equals"); 
        }
    }
}