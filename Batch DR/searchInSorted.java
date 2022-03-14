public class searchInSorted {
    public static void main(String[] args) {
        int[][] arr = input();

        int tar = 143;

        //Brute force approach:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; i++) {
                if (arr[i][j] == tar) {
                    System.out.println(i + "  " + j);
                    return;
                }
            }
        }

        System.out.println(-1 + "  " + -1);



        //Optimised:
        int crow = 0, ccol = arr[0].length - 1;

        while(crow < arr.length && ccol >= 0){

            if(tar > arr[crow][ccol]){
                crow++;
            }else if(tar < arr[crow][ccol]){
                ccol--;
            }else{
                System.out.println(crow + " " + ccol);
                return;
            }

        }

        System.out.println(-1 + "  " + -1);
    }

    public static int[][] input() {
        return new int[][] {
                { 11, 12, 13, 14 },
                { 21, 22, 23, 24 },
                { 31, 32, 33, 34 },
                { 41, 42, 43, 44 },
        };
    }

}
