
class T9_A_Q09 {

    public static void main(String[] args) {
        int[] arr = {45, 12, 78, 34, 5};
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}