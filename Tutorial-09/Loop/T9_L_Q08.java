// 8.Write a program to print all elements of an array using for-each.

class test
{
    void display()
    {
        int arr[] = {10, 20, 30, 40, 50};
        
        for(int num : arr) // for-each loop
        {
            System.out.println(num);
        }
    }
}
class T9_L_Q08 {
    public static void main(String[] q) 
    {
        test t = new test();
        t.display();
    }
}