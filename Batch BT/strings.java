import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "SomethingRandom";

        
        String sub1 = str.substring(0, 5);
        String sub2 = str.substring(12);
        
        // System.out.println(sub1);
        // System.out.println(sub2);

        String str2 = "This,is,just,a,random,string";

        String[] splitted = str2.split(",");
        for(int i=0; i<splitted.length; i++){
            System.out.println(splitted[i]);
        }

    }
}
