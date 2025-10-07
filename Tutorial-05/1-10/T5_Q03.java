// User Input Check if a number is a 3-digit number.

import java.util.Scanner;
import java.io.*;
public class T5_Q03 {
    public static void main(String[] f) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

	if(n >= 100 && n <= 999)
	{
		System.out.println(n + " is 3-digits number");
	}

	else{
		System.out.println(n + " is not 3-digits number");
	}

    }
}