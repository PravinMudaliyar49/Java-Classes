import java.util.Arrays;

public class insertions {
    public static void main(String[] args) {
        int[] arr = { 0, -10, -1, 3, 2, 10, 8, 3, 10, -9 };

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }else{
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
