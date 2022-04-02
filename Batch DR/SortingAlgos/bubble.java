package SortingAlgos;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = { 12, 13, 9, 16, 5, 7 };

        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    flag = true;
                    swap(arr, j, j + 1);
                }
            }

            if(flag == true){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
