import java.util.Arrays;

public class countsort {
    public static void main(String[] args) {
        int start = 10, end = 20;

        int[] arr = { 15, 12, 13, 20, 19, 15, 12, 13, 14, 11, 13, 17, 17, 13, 10 };

        int[] res = countSort(arr, start, end);
        System.out.println(Arrays.toString(res));

    }

    private static int[] countSort(int[] arr, int start, int end) {
        int[] ans = new int[arr.length];

        int[] farr = new int[end - start + 1];

        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] - start;
            farr[index]++;

            // int val = farr[index];
            // val++;
            // farr[index] = val;
        }

        for (int i = 1; i < farr.length; i++) {
            int sum = farr[i] + farr[i - 1];
            farr[i] = sum;

            // for (int i = 1; i < farr.length; i++) farr[i] += farr[i - 1];
        }

        for (int i = 0; i < farr.length; i++) {
            farr[i]--;
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = arr[i] - start;
            int val = farr[idx];

            ans[val] = arr[i];
            farr[idx]--;

            // ans[farr[arr[i] - start]] = arr[i];
            // farr[arr[i] - start]--;
        }

        return ans;
    }
}
