// NAME:JAIMINSINH DODIYA
// ROLL NO:42 

import java.util.Scanner;

class Q10 
{

    public static void main(String k[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try 
        {
            if (age < 18) 
            {
                throw new IllegalArgumentException("Age must be 18 or older to proceed.");
            }
            System.out.println("You are eligible.");

        } 
        catch (IllegalArgumentException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        } 
        
        finally 
        {
            sc.close();
        }
    }
}