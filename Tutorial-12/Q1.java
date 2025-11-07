// Write a program to demonstrate the use of try and catch block for handling Arithmetic Exception (e.g., divide by zero).
// NAME:JAIMINSINH DODIYA
// ROLL NO:42 


class Q1
{
	public static void main(String k[]) 
	{
        try 
	{
            int a = 10;
            int b = 0;
            int result = a / b;              
	    System.out.println("Result: " + result);
        } 

	catch (ArithmeticException e) 
	{
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}
