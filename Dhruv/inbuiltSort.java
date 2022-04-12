import java.util.*;

public class inbuiltSort{
    public static void main(String[] args) {
        // 1 2 3 5 6 7 8 9 10

        //To sort an array O(nlogn) :
        
        int[] arr = {10, 9, 1, 5, 3, 2, 6, 7, 8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        

        //To sort an Arraylist O(nlogn) :

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(2, 100);

        Collections.sort(list);
        System.out.println(list);

    }
}