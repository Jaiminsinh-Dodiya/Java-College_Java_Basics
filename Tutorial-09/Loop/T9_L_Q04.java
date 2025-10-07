// 4. Write a program to find factorial of a number using a for loop.

class test
{
    void display()
    {
        int num = 5; // You can change this value to compute factorial of a different number
        int factorial = 1;
        
        for(int i=1; i<=num; i++)
        {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}

class T9_L_Q04 {
    public static void main(String[] c) 
    {
        test t = new test();
        t.display();
    }
}