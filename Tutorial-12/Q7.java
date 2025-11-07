// NAME:JAIMINSINH DODIYA
// ROLL NO:42 

class Q7 {

    public static void main(String k[]) 
    {
        try 
        {
            int a = 10 / 0;
        } 
        
        catch (ArithmeticException e) 
        {
            System.out.println("Caught ArithmeticException.");
        } 
        
        finally 
        {
            System.out.println("Finally block always executes.");
        }
    }
}