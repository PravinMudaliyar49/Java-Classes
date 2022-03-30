import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 10, 25, 9, 6, 14, 1 };

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
