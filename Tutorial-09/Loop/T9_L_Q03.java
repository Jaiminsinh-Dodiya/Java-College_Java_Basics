// 3. Write a program to print multiplication table of a given number ( number fetch from the user).

import java.util.Scanner;
class test
{
    void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();
        
        for(int i=1; i<=10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
        sc.close();
    }
}

class T9_L_Q03 {
    public static void main(String[] f) 
    {
        test t = new test();
        t.display();
    }
}