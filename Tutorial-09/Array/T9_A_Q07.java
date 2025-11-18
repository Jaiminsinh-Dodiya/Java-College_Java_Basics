
class T9_A_Q07 {

    public static void main(String[] args) {
        int size = 5;
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[size];
        for (int i = 0; i < size; i++) {
            copy[i] = original[i];
        }
        System.out.println("Copied array:");
        for (int i = 0; i < size; i++) {
            System.out.println(copy[i]);
        }
    }
}