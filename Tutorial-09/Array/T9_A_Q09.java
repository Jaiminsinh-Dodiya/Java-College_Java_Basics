
class T9_A_Q09 {

    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 40, 50};
int sum = 0;
int size = 5;
for (int i = 0; i < size; i++) {
sum += arr[i];
}
double average = (double) sum / size;
System.out.println("Average: " + average);

    }
}