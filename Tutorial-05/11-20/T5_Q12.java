
import java.util.Scanner;
public class T5_Q12 
{
    public static void main(String[] d) 
	{

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();
       
        if (num < 0) 
	{
            num = -num;
        }

        System.out.println("Absolute value: " + num);
	}
}