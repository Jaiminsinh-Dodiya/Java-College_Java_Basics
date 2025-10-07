// Write a program to find the largest and smallest element in an array using for-each.

class test
{
    void display()
    {
        int arr[] = {45, 22, 89, 14, 67};
        int largest = arr[0];
        int smallest = arr[0];
        
        for(int num : arr) // for-each loop
        {
            if(num > largest)
                largest = num; // Update largest
            if(num < smallest)
                smallest = num; // Update smallest
        }
        
        System.out.println("Largest element is: " + largest);
        System.out.println("Smallest element is: " + smallest);
    }
}
class T9_L_Q10 {
    public static void main(String[] q) 
    {
        test t = new test();
        t.display();
    }
}