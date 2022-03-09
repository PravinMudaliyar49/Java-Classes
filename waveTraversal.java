public class waveTraversal {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 50, 90, 130, 170 },
                { 20, 60, 100, 130, 180 },
                { 30, 70, 110, 150, 190 },
                { 40, 80, 120, 160, 200 }
        };

        // boolean isVertical = true;

        // for (int j = 0; j < arr[0].length; j++) {

        // if (isVertical == true) {
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i][j]);
        // }

        // isVertical = false;
        // } else {
        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.println(arr[i][j]);
        // }

        // isVertical = true;
        // }

        // }

        boolean isVertical = true;

        for (int j = 0; j < arr[0].length; j++) {

            if (isVertical) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }

            } else {
                for (int i = arr.length - 1; i >= 0; i--) {
                    System.out.println(arr[i][j]);
                }

            }

            isVertical = !isVertical;
        }

        // This won't work:
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // System.out.print(arr[j][i] + " ");
        // }

        // System.out.println();
        // }

    }
}
