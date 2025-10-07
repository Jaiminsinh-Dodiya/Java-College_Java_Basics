// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;
public class T5_Q14
{
    public static void main(String[] r) 
    {
        Scanner sc = new Scanner(System.in);
        int length, breadth;

        System.out.print("Enter the length of the side: ");
        length = sc.nextInt();
        
        System.out.print("Enter the breadth of the side: ");
        breadth = sc.nextInt();

        // Check if the given dimensions can form a square
        if (length == breadth) {
            System.out.println("The dimensions can form a square.");
        } else {
            System.out.println("The dimensions cannot form a square.");
        }
    }
}