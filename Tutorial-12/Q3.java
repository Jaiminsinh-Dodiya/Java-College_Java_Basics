// NAME:JAIMINSINH DODIYA
// ROLL NO:42 

class Q3 {

    public static void main(String k[]) 
    {
        try 
        {
            int[] arr = {1, 2, 3};
            int a = 10 / 0;
            System.out.println(arr[5]);
            String str = null;
            System.out.println(str.length());
        } 

        catch (ArithmeticException e) 
        {
            System.out.println("ArithmeticException caught!");
        } 
        
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        } 
        
        catch (NullPointerException e) 
        {
            System.out.println("NullPointerException caught!");
        }
    }
}
