public class selection {
    public static void main(String[] args) {
        int[] arr = { 0, -10, -1, 3, 2, 10, 8, 3, 10, -9 };

        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            swap(arr, min, i);

        }

    }

    public static void swap(int[] arr, int min, int i) {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }

}
