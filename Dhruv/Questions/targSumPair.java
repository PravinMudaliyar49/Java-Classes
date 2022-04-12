package Questions;

import java.util.Arrays;

public class targSumPair {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 6, 3, 8, 1, 9, 4 };
        int target = 8;

        Arrays.sort(arr);

        int start = 0, end = arr.length - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum < target) {
                start++;
            } else if (sum > target) {
                end--;
            } else {
                System.out.println(arr[start] + " " + arr[end]);

                start++;
                end--;
            }
        }

    }
}
