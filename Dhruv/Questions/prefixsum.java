package Questions;

import java.util.*;

public class prefixsum {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 4, 4, 5 };
        
        Random r = new Random();
        int[] res = r.prefixSum2(arr);
        
        System.out.println(Arrays.toString(res));
    }
    
}

class Random {
    public int[] prefixSum1(int[] arr) {

        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        
        int i = 1;

        while(i < arr.length){
            int sum = arr[i] + ans[i - 1];
            ans[i] = sum;

            i++;
        }

        return ans;
    }

    public int[] prefixSum2(int[] arr) {

        int[] ans = new int[arr.length];
        ans[0] = arr[0];
        
        int i = 0;

        while(++i < arr.length) ans[i] = arr[i] + ans[i - 1];

        return ans;
    }
}
