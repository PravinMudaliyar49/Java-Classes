import java.util.*;

public class ceilAndFloor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int element = sc.nextInt();

        int[] res = ceilAndFloor(arr, element);
        System.out.println(res[0] + " " + res[1]);

    }

    public static int[] ceilAndFloor(int[] arr, int ele) {
        int ceil = -1, floor = -1;
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            int currEleVal = arr[mid];

            if (currEleVal < ele) {
                start = mid + 1;
                floor = currEleVal;
                
            } else if (currEleVal > ele) {
                end = mid - 1;
                ceil = currEleVal;
                
            } else if(currEleVal == ele) {
                ceil = currEleVal;
                floor = currEleVal;
                break;
            }
        }

        int[] ans = {floor, ceil};
        return ans;
    }

}
