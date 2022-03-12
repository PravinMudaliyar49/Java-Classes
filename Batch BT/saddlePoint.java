public class saddlePoint {
    public static void main(String[] args) {
        int[][] arr = {
                { 11, 21, 31, 41, 51, 61 },
                { 12, 22, 32, 42, 52, 62 },
                { 13, 23, 33, 43, 53, 63 },
                { 14, 24, 34, 44, 54, 64 },
        };

        for (int i = 0; i < arr.length; i++) {
            int maxInRow = 0;

            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > arr[i][maxInRow]) {
                    maxInRow = j;
                }
            }

            boolean isSaddle = true;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k][maxInRow] < arr[i][maxInRow]) {
                    isSaddle = false;
                    break;
                }
            }

            if(isSaddle){
                System.out.println(arr[i][maxInRow]);
                return;
            }

        }

        System.out.println(-1);
    }
}
