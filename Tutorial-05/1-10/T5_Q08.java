// User Input Accept age and check category: child, teen, adult, senior.

import java.util.Scanner;
public class T5_Q08 {
    public static void main(String[] f) {

        Scanner sc = new Scanner(System.in);
        int age;

        System.out.print("Enter the age: ");
        age = sc.nextInt();

        // Simple If with no variable
        if (age < 13) 
	{
            System.out.println("Category: Child");
        } 
	else if (age < 20)
	{
            System.out.println("Category: Teen");
        } 
	else if (age < 60)
	{
            System.out.println("Category: Adult");
        }
	else
	{
            System.out.println("Category: Senior");
        }
    }
}