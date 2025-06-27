public class PawalaSort {
    public static void main(String[] args) {
        int[] arr = {8, 6, 9, 2, 4, 5};
        pawalaSort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }

    public static void pawalaSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
