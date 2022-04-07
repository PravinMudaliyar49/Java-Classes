import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1, 2};

        // int temp = arr[0];
        // arr[0] = arr[1];
        // arr[1] = temp;

        swap(arr, 0, 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

