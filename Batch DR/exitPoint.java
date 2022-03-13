public class exitPoint {
    public static void main(String[] args) {
        int[][] arr = {
                { 0, 0, 1, 0, 0, 0 },
                { 1, 0, 0, 1, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 }
        };

        int dir = 0;
        int crow = 0, ccol = 0;
        int lrow = -1, lcol = -1;

        while (true) {
            dir = (dir + arr[crow][ccol]) % 4;

            if (dir == 0) { // Move east.
                ccol++;
            } else if (dir == 1) { // Move south.
                crow++;
            } else if (dir == 2) { // Move west.
                ccol--;
            } else { // Move north.
                crow--;
            }

            if (crow < 0 || crow == arr.length || ccol < 0 || ccol == arr[0].length) {
                break;
            }

            lrow = crow;
            lcol = ccol;
        }

        System.out.println(lrow + " " + lcol);

    }
}
