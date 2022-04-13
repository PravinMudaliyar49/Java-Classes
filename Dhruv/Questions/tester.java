// package Questions;

import java.util.Arrays;

public class tester {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 1, 7, 8, 9 };
        int[] arr2 = { 1, 1, 2 };

        mergeSorted m = new mergeSorted();

        int[] res = m.mergeTwoSorted(arr1, arr1.length, arr2, arr2.length);

        System.out.println(Arrays.toString(res));
    }
}