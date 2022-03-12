public class exitPointMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 0, 0, 1, 0 },
                { 0, 0, 0, 1 },
                { 0, 0, 0, 1 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 }
        };

        // ans: 3rd row and 0th col.

        int crow = 0, ccol = 0;
        int lrow = -1, lcol = -1;
        
        int dir = 0;        //east -> 0 and south -> 1 and west -> 2 and north -> 3.

        while (true) {
            int cellValue = arr[crow][ccol];
            dir = (dir + cellValue) % 4;

            if (dir == 0) {
                ccol++;     //Move towards east
            } else if (dir == 1) {
                crow++;     //Move towards south
            } else if (dir == 2) {
                ccol--;     //Move towards west
            } else {
                crow--;     //Move towards north
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
