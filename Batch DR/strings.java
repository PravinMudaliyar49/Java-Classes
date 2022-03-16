import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String str = sc.nextLine();
        // String str2 = sc.next();

        // System.out.println(str);
        // System.out.println(str2);

        // String str = "ThisisRandomwird";

        // String[] splittedArray = str.split("i");

        // System.out.println(Arrays.toString(splittedArray));

        // for (int i = 0; i < splittedArray.length; i++) {
        // System.out.println(splittedArray[i]);
        // }

        // String str = "This is random string";

        // String str1 = str.substring(0, 5);
        // String str2 = str.substring(1, 10); //StringOutOfBound.
        // String str3 = str.substring(6);

        // System.out.println(str1);
        // System.out.println(str3);

        // CONCATENATION WORKING IN JAVA.
        // System.out.println("Dello " + "Hello" + 1 + 2); // Dello Hello12
        // System.out.println("Dello " + "Hello" + 1 + 2 + " Hello"); // Dello Hello12
        // Hello
        // System.out.println(1 + 2 + " Hello"); // 3 Hello

        // String s1 = "Hello";
        // String s2 = "Hello";
        // String s3 = new String("Hello");
        // String s4 = s1;

        // System.out.println(s1 == s2);
        // System.out.println(s1 == s3);
        // System.out.println(s1 == s4);

        // //Recommended:
        // System.out.println(s1.equals(s2));
        // System.out.println(s1.equals(s3));
        // System.out.println(s1.equals(s4));

        // String name = sc.nextLine();
        // String aname = "Random";

        // System.out.println(name == aname);
        // System.out.println(name.equals(aname));

        // String str = "Hello";

        // str += 1;

        // System.out.println(str);

        StringBuilder sb = new StringBuilder("Hello");

        // System.out.println(sb.charAt(1));
        
        // sb.setCharAt(4, 'p');       //Hellp
        // sb.insert(0, "ch");     //chHello
        // sb.deleteCharAt(0);      // ello
        // sb.append("ch");        //Helloch

        System.out.println(sb);

    }
}
