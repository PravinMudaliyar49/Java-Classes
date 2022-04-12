import java.util.*;

public class inbuiltsort {
    public static void main(String[] args) {
        // int[] arr = {7, 1, 2, 5, 3, 1, 5, -1, 4, -2};
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(15);
        list.add(30);
        list.add(20);
        list.add(-5);
        list.add(50);

        Collections.sort(list);

        System.out.println(list);

    }
}
