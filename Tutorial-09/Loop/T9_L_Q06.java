// 6. Write a program to count digits in a given number using a while loop.

import java.util.Scanner;
class test
{
    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");
        int num = sc.nextInt();
        int count = 0;
        
        while(num != 0)
        {
            num /= 10; // Remove the last digit
            count++;   // Increment the count
        }
        
        System.out.println("Number of digits is: " + count);
        sc.close();
    }
}
class T9_L_Q06 {
    public static void main(String[] q) 
    {
        test t = new test();
        t.display();
    }
}