// Input character and check if it is a digit or not.

import java.util.Scanner;
public class T5_Q09
{
    public static void main(String[] d) 
    {

        Scanner sc = new Scanner(System.in);
        char ch;

        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);

        // Check if the character is a digit
        if (Character.isDigit(ch)) {
            System.out.println("The character is a digit.");
        } else {
            System.out.println("The character is not a digit.");
        }
    }
}