public class ternary {
    public static void main(String[] args) {
        int a = 1000, b = 200, c = 150, d = 0;

        // if(a > b){
        // c = a;
        // }else{
        // c = b;
        // }

        // c = a > b ? a : b;

        // System.out.println(a > b ? a : b);

        // if (a > b) {
        //     if (a > c) {
        //         d = a;
        //     } else {
        //         d = c;
        //     }

        // } else if (b > c) {
        //     d = b;
        // } else {
        //     d = c;
        // }

        // d = a > b ? (a > c ? a : c) : b > c ? b : c ;

        System.out.println(a > b ? (a > c ? a : c) : b > c ? b : c);

    }
}
