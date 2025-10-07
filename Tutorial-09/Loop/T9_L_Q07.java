// 7. Write a program to reverse a number using a do while loop.
import java.util.Scanner;
class test
{
    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();
        int reversed = 0;
        
        do
        {
            int digit = num % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            num /= 10; // Remove the last digit
        } while(num != 0);
        
        System.out.println("Reversed number is: " + reversed);
        sc.close();
    }
}

class T9_L_Q07 {
    public static void main(String[] q) 
    {
        test t = new test();
        t.display();
    }
}