import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // CREATE.
        // int x = 10;
        // list.add(x); //ADD.

        // list.add(15); list.add(20); list.add(30);

        // System.out.println(list.size() + " -> " + list); //PRINT

        // int val1 = list.get(0); //int val = arr[0]; READ
        // System.out.println(val1);

        // list.set(0, 100); //arr[0] = 100; UPDATE

        // System.out.println(list.size() + " -> " + list);

        // list.remove(0); //DELETE

        // System.out.println(list.size() + " -> " + list);

        // ArrayList<String> list2 = new ArrayList<>();
        // list2.add("Hello");
        // list2.add("World");
        // list2.add("!");

        // System.out.println(list2.size() + " -> " + list2);

        int[] arr = { 10, 20, 30, 40, 50 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i : arr) {
            System.out.print(i + " ");
        }

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println();
        
        for(int val : list){
            System.out.print(val + " ");
        }

    }
}
