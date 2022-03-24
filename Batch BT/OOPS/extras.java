import java.util.*;

public class extras {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Random ranvar = new Random();
        // // max and min.

        // while (true) {

        // int max = sc.nextInt();
        // int min = sc.nextInt();

        // int randomNum = ranvar.nextInt(max - min);
        // System.out.println(randomNum + min);
        // }

        // It gives a random number in the range 0.0 to 0.99.
        // double val = Math.random();
        // System.out.println(val * 10);


        //TERNARY OPERATORS:
        
        // int a = 30, b = 50;
        // int c = 0;

        // // if(a > b){
        // // c = a;
        // // }else{
        // // c = b;
        // // }

        // // Ternary:
        // c = a > b ? a : b;

        // System.out.println(c); // 50.

        int a = 10, b = 200, c = 300, ans = 0;

        // if(a > b){
        //     if(a > c){
        //         ans = a;
        //     }else{
        //         ans = c;
        //     }
        // }else if(b > c){
        //     ans = b;
        // }else{
        //     ans = c;
        // }

        ans = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;

        System.out.println(ans);
        
    }
}