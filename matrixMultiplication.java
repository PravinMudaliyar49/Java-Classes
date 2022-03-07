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

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {

                for (int k = 0; k < r2; k++) {
                    int product = arr1[i][k] * arr2[k][j];
                }

            }
        }

    }
}
