import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        // int[] arr = { 9, 2, 19, 80, 6, -1, -4, 4, 21, 9, 0 };
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            
            for (int j = 0; j < arr.length - 1 - i; j++) {
                count++;

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    flag = true;
                }
            }

            if (flag == false) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(count);

    }
}