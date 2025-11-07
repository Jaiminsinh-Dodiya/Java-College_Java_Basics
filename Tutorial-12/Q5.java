// NAME:JAIMINSINH DODIYA
// ROLL NO:42 

class Q5 {

    public static void main(String k[]) 
    {
        try 
        {
            try 
            {
                int[] arr = new int[3];
                arr[5] = 10;
            } 
            
            catch (ArrayIndexOutOfBoundsException e) 
            {
                System.out.println("Inner catch: Array index out of bounds.");
            }

            int a = 10 / 0;  // Outer block exception
        } 
        
        catch (ArithmeticException e) 
        {
            System.out.println("Outer catch: Divide by zero error.");
        }
    }
}
