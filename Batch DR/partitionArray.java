import java.util.Arrays;

import SortingAlgos.sort01;

public class partitionArray {
    public static void main(String[] args) {
        int[] arr = { 10, 15, 13, 5, 5, 17, 19, 20, 7, -2, 11 };
        int target = 11;
        
        sort01 s = new sort01();

        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] <= target) {
                s.swap(arr, i, j);
                j++;
            }

            i++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
