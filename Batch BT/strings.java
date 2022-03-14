import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = "SomethingRandom";

        // String sub1 = str.substring(0, 5);
        // String sub2 = str.substring(12);

        // System.out.println(sub1);
        // System.out.println(sub2);

        // String str2 = "This,is,just,a,random,string";

        // String[] splitted = str2.split(",");
        // for(int i=0; i<splitted.length; i++){
        // System.out.println(splitted[i]);
        // }

        // System.out.println("Hello" + 1 + 2);
        // System.out.println(1 + 2 + "World");

        // String s1 = "Hello";
        // String s2 = "Hello";
        // String s3 = s1;
        // String s4 = new String("Hello");

        // System.out.println(s1 == s2);
        // System.out.println(s1 == s3);
        // System.out.println(s1 == s4);

        // String name = sc.nextLine();
        // String actualName = "Random";

        // System.out.println(name.equals(actualName));
        // System.out.println(name == actualName);

        // StringBuilder sb = new StringBuilder("Hello");

        // sb.insert(0, "B");
        // System.out.println(sb.charAt(0));
        // sb.deleteCharAt(1);
        // sb.replace(0, 2, "B");
        // sb.append(" World");

        // System.out.println(sb);

        String str = "H";

        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            str += i;
        }

        long end1 = System.currentTimeMillis();

        System.out.println(end1 - start1);

        long start2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }

        long end2 = System.currentTimeMillis();

        System.out.println(end2 - start2);

    }
}
