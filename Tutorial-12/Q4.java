// NAME:JAIMINSINH DODIYA
// ROLL NO:42 


class Q4
{
	public static void main(String k []) 
	{
        try 
	{
            int a = 10 / 0;   
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); 
        } 
 	catch (ArithmeticException e) 
	{
            System.out.println("Caught ArithmeticException.");
        } 
	catch (ArrayIndexOutOfBoundsException e) 
	{
            System.out.println("Caught ArrayIndexOutOfBoundsException.");
        }
    }
}