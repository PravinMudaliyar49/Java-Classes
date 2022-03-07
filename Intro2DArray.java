import java.util.*;

public class Intro2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // I syntax:
        int[][] arr1 = new int[2][3];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        int[][] arr2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // System.out.println(arr.length);
        // System.out.println(arr[0].length);

        // Q. Take array as input and display it:

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] array = new int[row][col];

        // Take inputs:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Display the array:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.println();
        }

        // Using Arrays.toString(array):
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

    }
}
