import java.util.Arrays;

public class sort01 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 0, 0, 0, 1, 1, 0 };

        // int[] res = unoptimised(arr);
        int[] res = optimised(arr);
        System.out.println(Arrays.toString(res));

    }

    private static int[] optimised(int[] arr) {

        int i = 0, j = 0;

        while (i < arr.length) {
            if (arr[i] == 0) {
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

    public static int[] unoptimised(int[] arr) {
        int[] ans = new int[arr.length];

        int czeroes = 0, cones = 0;

        for (int val : arr) {
            if (val == 0) {
                czeroes++;
            } else {
                cones++;
            }
        }

        int idx = 0;
        while (czeroes > 0) {
            ans[idx] = 0;
            idx++;
            czeroes--;
        }

        while (cones > 0) {
            ans[idx] = 1;
            idx++;
            cones--;
        }

        return ans;
    }
}