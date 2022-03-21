// package Batch BT.SortingAlgos;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 1, 10, 34, 21, 56 };

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSorted = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = true;
                    swap(arr, j, j + 1);
                }
            }

            if (isSorted == false) {
                break;
            }
        }

        displayArr(arr);
    }

    private static void displayArr(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }

        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
