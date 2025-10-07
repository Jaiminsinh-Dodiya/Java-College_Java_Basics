// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B


import java.util.Scanner;
public class T5_Q18
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char ch;

        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);

        // Check if the character is a space
        if (Character.isWhitespace(ch)) {
            System.out.println("The character is a space.");
        } else {
            System.out.println("The character is not a space.");
        }
    }
}