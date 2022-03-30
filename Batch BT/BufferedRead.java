import java.util.*;
import java.io.*;

public class BufferedRead {
    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // int n = sc.nextInt();

        // System.out.println(n + " " + str);

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        String str = br.readLine();
        System.out.println(str);

        String input = br.readLine();
        int n = Integer.parseInt(input);



        System.out.println(n);


    }
}
