import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class matrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] arr1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] arr2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        if (c1 != r2) {
            System.out.println("Not possible!");
            return;
        }

        int[][] res = new int[r1][c2];

        for (int row = 0; row < res.length; row++) {
            for (int col = 0; col < res[row].length; col++) {
                int sum = 0;

                for (int k = 0; k < r2; k++) {
                    int product = arr1[row][k] * arr2[k][col];
                    sum += product; // sum = sum + product;
                }

                res[row][col] = sum;
            }
        }

        for (int row = 0; row < res.length; row++) {
            for (int col = 0; col < res[row].length; col++) {
                System.out.print(res[row][col] + " ");
            }

            System.out.println();
        }

        for (int row = 0; row < res.length; row++) {
            System.out.println(Arrays.toString(res[row]));
        }

    }
}
