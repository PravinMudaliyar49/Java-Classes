// package Batch DR;

public class spiralTraversal {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 60, 110, 160, 210 },
                { 20, 70, 120, 170, 220 },
                { 30, 80, 130, 180, 230 },
                { 40, 90, 140, 190, 240 },
                { 50, 100, 150, 200, 250 }
        };

        int n = arr.length;
        int m = arr[0].length;

        int mir = 0, mic = 0;
        int mar = n - 1, mac = m - 1;

        int totalCnt = n * m;
        int count = 0;

        while (count < totalCnt) {

            for (int row = mir, col = mic; row <= mar && count < totalCnt; row++) {
                System.out.print(arr[row][col] + " ");
                count++;
            }
            mic++;
            System.out.println();

            for (int col = mic, row = mar; col <= mac && count < totalCnt; col++) {
                System.out.print(arr[row][col] + " ");
                count++;
            }
            mar--;
            System.out.println();

            for (int row = mar, col = mac; row >= mir && count < totalCnt; row--) {
                System.out.print(arr[row][col] + " ");
                count++;
            }
            mac--;
            System.out.println();
            
            for (int col = mac, row = mir; col >= mic && count < totalCnt; col--) {
                System.out.print(arr[row][col] + " ");
                count++;
            }
            mir++;
            System.out.println();

        }

    }
}
