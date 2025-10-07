// 9.Write a program to find the sum of all array elements using for-each.

class test
{
    void display()
    {
        int arr[] = {10, 20, 30, 40, 50};
        int sum = 0;
        
        for(int num : arr) // for-each loop
        {
            sum += num; // Add each element to sum
        }
        
        System.out.println("Sum of all array elements is: " + sum);
    }
}
class T9_L_Q09 {
    public static void main(String[] q) 
    {
        test t = new test();
        t.display();
    }
}