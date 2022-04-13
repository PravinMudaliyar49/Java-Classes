import java.util.Arrays;

public class partitionArray {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 11, 9, 7, 15, 12, 13 };
        int pivot = 10;

        int[] res = partition(arr, pivot);
        System.out.println(Arrays.toString(res));
    }

    public static int[] partition(int[] arr, int tar) {
        int i = 0, j = 0;

        while (i < arr.length) {
            if (arr[i] <= tar) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }

        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
