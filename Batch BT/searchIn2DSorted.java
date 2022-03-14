public class searchIn2DSorted {
    public static void main(String[] args) {
        int[][] arr = {
                { 11, 12, 13, 14 },
                { 21, 22, 23, 24 },
                { 31, 32, 33, 34 },
                { 41, 42, 43, 44 },
        };

        int target = 240;
        int crow = 0, ccol = arr[0].length - 1;

        while (crow < arr.length && ccol > 0) {
            if (arr[crow][ccol] < target) {
                crow++;
            } else if (arr[crow][ccol] > target) {
                ccol--;
            } else {
                System.out.println("Found in " + crow + " " + ccol);
                return;
            }
        }

        System.out.println("Not found");
    }
}
