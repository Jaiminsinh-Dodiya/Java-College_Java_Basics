// NAME:JAIMINSINH DODIYA
// ROLL NO:42 

class Q8
{

    public static int testMethod() 
    {
        try 
        {
            int a = 10 / 0;
            return 1;
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Caught ArithmeticException.");
            return 2;
        } 
        finally 
        {
            System.out.println("Finally block executed.");
        }
    }

    public static void main(String k[]) 
    {
        System.out.println("Returned value: " + testMethod());
    }
}