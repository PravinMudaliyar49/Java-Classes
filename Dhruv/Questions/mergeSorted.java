// package Questions;

public class mergeSorted {
    public int[] mergeTwoSorted(int[] a1, int n, int[] a2, int m) {
        int[] ans = new int[m + n];

        int p1 = 0, p2 = 0, p3 = 0;

        while (p1 < n && p2 < m) {
            if (a1[p1] < a2[p2]) {
                ans[p3] = a1[p1];
                p1++;
            } else {
                ans[p3] = a2[p2];
                p2++;
            }

            p3++;
        }

        while (p1 < n) {
            ans[p3] = a1[p1];
            p1++;
            p3++;
        }

        while (p2 < m) {
            ans[p3] = a2[p2];
            p2++;
            p3++;
        }

        return ans;
    }
}