import java.util.Arrays;

public class targSumPair {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 6, 3, 8, 4, 1, 7 };
        int target = 12;

        targetSumPair(arr, target);
    }

    private static void targetSumPair(int[] arr, int target) {
        Arrays.sort(arr);

        int start = 0, end = arr.length - 1;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum == target) {
                System.out.println(arr[start] + " " + arr[end]);
                start++;
                end--;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }

        }

    }
}
