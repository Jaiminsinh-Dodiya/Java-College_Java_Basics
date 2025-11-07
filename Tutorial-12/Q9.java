// NAME:JAIMINSINH DODIYA
// ROLL NO:42 

class Q9 
{

    public static void main(String k[]) 
    {
        try 
        {
            throw new ArithmeticException("Manually thrown ArithmeticException");
        } 
        
        catch (ArithmeticException e) 
        {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}