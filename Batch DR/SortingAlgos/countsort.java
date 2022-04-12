package SortingAlgos;

import java.util.*;

public class countsort {
    public static void main(String[] args) {
        // Range -> 3 - 12.

        int[] arr = { 9, 7, 8, 12, 8, 8, 7, 9, 4, 6, 4, 5, 6, 3 };

        int[] ans = countsort(arr, 3, 12);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] countsort(int[] arr, int start, int end) {
        int[] ans = new int[arr.length];

        int[] farr = new int[end - start + 1];

        for (int i = 0; i < arr.length; i++) {
            int ind = arr[i] - start;
            farr[ind]++;
        }

        int[] presum = new int[farr.length];
        presum[0] = farr[0];

        for (int i = 1; i < presum.length; i++) {
            presum[i] = presum[i - 1] + farr[i];
        }

        for (int i = 0; i < presum.length; i++) {
            presum[i]--;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            int ind = val - start;
            int indVal = presum[ind];
            presum[ind]--;
            
            ans[indVal] = val;
        }

        return ans;
    }

}