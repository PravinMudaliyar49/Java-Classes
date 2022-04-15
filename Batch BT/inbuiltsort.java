import java.util.*;

public class inbuiltsort {
    public static void main(String[] args) {
        // int[] arr = {3, 5, 1, 7, 8, 4, 1, 9, 10, -1, 1, -2, 0};

        // Arrays.sort(arr);

        // System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(-1);
        list.add(-5);
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(6);

        Collections.sort(list);

        System.out.println(list);


    }
}
