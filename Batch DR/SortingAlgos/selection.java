package SortingAlgos;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = { 9, 2, 5, 13, 7, 1, 8 };

        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
