import java.util.Arrays;

public class prefixsum {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 7, 9, 8};

        int[] ans = new int[arr.length];
        ans[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            ans[i] = ans[i - 1] + arr[i];
        }

        System.out.println(Arrays.toString(ans));

    }
}
