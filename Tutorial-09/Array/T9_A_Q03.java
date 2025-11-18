
class T9_A_Q03 {
    public static void main(String[] args) {
        int[] arr = {45, 22, 89, 16, 5};
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}
