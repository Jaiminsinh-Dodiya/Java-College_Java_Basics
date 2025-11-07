// NAME:JAIMINSINH DODIYA
// ROLL NO:42 

class Q6 {

    public static void main(String k[]) 
    {
        try 
        {
            try 
            {
                int a = 10 / 0;
            } 
            
            catch (ArithmeticException e) 
            {
                System.out.println("Inner catch: Division by zero.");
            }

            String str = null;
            System.out.println(str.length());
        } 
        
        catch (NullPointerException e) 
        {
            System.out.println("Outer catch: Null pointer encountered.");
        }
    }
}