// package Batch BT;

public class spiralTraversal {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 60, 110, 160, 210 },
                { 20, 70, 120, 170, 220 },
                { 30, 80, 130, 180, 230 },
                { 40, 90, 140, 190, 240 },
                { 50, 100, 150, 200, 250 }
        };

        int n = arr.length, m = arr[0].length;

        int mir = 0, mic = 0;
        int mar = n - 1, mac = m - 1;

        int totalCount = n * m;
        int count = 0;

        while (count < totalCount) {
            for (int row = mir, col = mic; row <= mar && count < totalCount; row++) {
                System.out.println(arr[row][col]);
                count++;
            }
            mic++;
            
            for (int row = mar, col = mic; col <= mac && count < totalCount; col++) {
                System.out.println(arr[row][col]);
                count++;
            }
            mar--;
            
            for (int row = mar, col = mac; row >= mir && count < totalCount; row--) {
                System.out.println(arr[row][col]);
                count++;
            }
            mac--;
            
            for (int row = mir, col = mac; col >= mic && count < totalCount; col--) {
                System.out.println(arr[row][col]);
                count++;
            }
            mir++;

        }

    }
}
