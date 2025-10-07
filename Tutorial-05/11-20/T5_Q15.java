// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q15 
{
    public static void main(String[] g) 
    {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // Check if the number is greater than 10 and less than 50
        if (number > 10 && number < 50) {
            System.out.println(number + " is greater than 10 and less than 50.");
        } else {
            System.out.println(number + " is not in the range of greater than 10 and less than 50.");
        }
    }
}