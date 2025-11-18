import java.util.Scanner;

class T9_A_Q08 {

    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 25};
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        System.out.print("Enter number to search: ");
        int input = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            if (arr[i] == input) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element found!"); 
        }else {
            System.out.println("Element not found.");
        }
    }
}
