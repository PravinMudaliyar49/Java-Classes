public class firstAndLastIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 5, 6, 7, 7, 7, 7 };
        int toFind = 2;

        int ans1 = firstInd(arr, toFind);
        int ans2 = lastInd(arr, toFind);

        System.out.println(ans1 + " " + ans2);
    }

    public static int firstInd(int[] arr, int ele) {
        int start = 0, end = arr.length - 1;
        int first = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int currEleVal = arr[mid];

            if (currEleVal < ele) {
                start = mid + 1;

            } else if (currEleVal > ele) {
                end = mid - 1;

            } else if (currEleVal == ele) {
                first = mid;
                end = mid - 1;
            }
        }

        return first;
    }

    public static int lastInd(int[] arr, int ele) {
        int start = 0, end = arr.length - 1;
        int last = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int currEleVal = arr[mid];

            if (currEleVal < ele) {
                start = mid + 1;

            } else if (currEleVal > ele) {
                end = mid - 1;

            } else if (currEleVal == ele) {
                last = mid;
                start = mid + 1;
            }
        }

        return last;
    }

}