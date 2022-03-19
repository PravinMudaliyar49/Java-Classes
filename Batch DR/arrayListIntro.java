// import java.util.*;
import java.io.*;

public class arrayListIntro {
    public static void main(String[] args) throws Exception {
        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);

        // list.set(2, 100);

        // list.remove(2);

        // System.out.println(list + " -> " + list.size());

        // System.out.println(list.get(2));

        // for (int i = 0; i < list.size(); i++) {
            // System.out.print(list.get(i) + " ");
        // }

        // System.out.println();

        
        // for(int val : list){
            // System.out.print(val + " ");
        // }
        
        // int[] arr = {10, 20, 30, 40, 50, 60};

        // for(int val : arr){
        //     System.out.print(val + " ");
        // }

        // String str = "Hello world";

        // for(char ch : str.toCharArray()){
        //     System.out.print(ch + " ");
        // }

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        String str = br.readLine();

        int i = Integer.parseInt(br.readLine());

        // "235" -> 235.

        System.out.println(str);

    }
}
