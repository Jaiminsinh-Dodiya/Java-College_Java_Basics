// Name: Jaiminsinh Dodiya, Rollno : 06, 3BCA-B

import java.util.Scanner;

class T5_Q46
{
    public static void main(String f[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b || b == c || a == c) {
            System.out.println("There are duplicate values.");
        } 
        else {
            System.out.println("All values are distinct.");
        }
    }

}
