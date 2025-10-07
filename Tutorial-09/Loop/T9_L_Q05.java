// 5. Write a program to find sum of digits of a number using a while loop.
import java.util.Scanner;
class test
{
    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the sum of its digits: ");
        int num = sc.nextInt();
        int sum = 0;
        
        while(num != 0)
        {
            sum += num % 10; // Add the last digit to sum
            num /= 10;       // Remove the last digit
        }
        
        System.out.println("Sum of digits is: " + sum);
        sc.close();
    }
}
class T9_L_Q05 {
    public static void main(String[] q) 
    {
        test t = new test();
        t.display();
    }
}