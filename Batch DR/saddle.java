public class saddle {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 6, 11, 16, 21, 31 },
                { 2, 7, 12, 17, 22, 32 },
                { 3, 8, 13, 18, 23, 33 },
                { 4, 9, 14, 19, 24, 34 },
                { 5, 10, 15, 20, 25, 35 }
        };

        for (int i = 0; i < arr.length; i++) {
            int mIndInRow = 0;

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > arr[i][mIndInRow]) {
                    mIndInRow = j;
                }
            }

            boolean isSaddle = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][mIndInRow] < arr[i][mIndInRow]) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle == true) {
                System.out.println(i + " " + mIndInRow + " --> " + arr[i][mIndInRow]);
                return;
            }

        }

        System.out.println("No saddle found.");
    }
}
