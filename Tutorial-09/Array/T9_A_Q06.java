
import java.util.Scanner;

class T9_A_Q06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] arr = new int[size]; // fixed-size array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}