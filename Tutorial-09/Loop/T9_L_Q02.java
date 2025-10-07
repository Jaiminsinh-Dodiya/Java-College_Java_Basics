// Write a program to print even numbers from 1 to 50 using while loop.

class test
{
    void display()
    {
        int i=2;
        while(i<=50)
        {
            System.out.println(i);
            i=i+2;
        }
    }
}


class T9_L_Q02 {
    public static void main(String[] q) 
    {
        test t = new test();
        t.display();
    }
}