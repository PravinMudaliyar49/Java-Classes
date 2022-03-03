package Classes;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int tar = 60;

        boolean ans = binarySearchAlgo(arr, tar);
        if(ans == true){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }

    }

    public static boolean binarySearchAlgo(int[] arr, int tar) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] < tar) {
                start = mid + 1;
            } else if (arr[mid] > tar) {
                end = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }

}
