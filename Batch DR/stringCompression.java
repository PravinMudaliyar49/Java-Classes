public class stringCompression {
    public static void main(String[] args) {
        String ip = "aaabbccdeff";

        // String compression 1:

        // APPROACH 1:

        // boolean[] visited = new boolean[26];
        // String ans = "";

        // for (int i = 0; i < ip.length(); i++) {
        // char ch = ip.charAt(i);
        // int asciiVal = ch - 'a';

        // if (visited[asciiVal] == false) {
        // ans += ch;
        // visited[asciiVal] = true;
        // }

        // }

        // System.out.println(ans);

        // APPROACH 2:

        // String ans = ip.charAt(0) + "";

        // for (int i = 1; i < ip.length(); i++) {
        // char currChar = ip.charAt(i);
        // char prevChar = ip.charAt(i - 1);

        // if (currChar != prevChar) {
        // ans += currChar;
        // }

        // }

        // System.out.println(ans);

        // String compression 2:

        String ans = ip.charAt(0) + "";
        int count = 1;

        for (int i = 1; i < ip.length(); i++) {
            char currChar = ip.charAt(i);
            char prevChar = ip.charAt(i - 1);

            if (currChar == prevChar) {
                count++;
                
            } else {

                if (count != 1) {
                    ans += count;
                }

                count = 1;
                ans += currChar + "";

            }

        }

        if (count != 1) {
            ans += count;
        }

        System.out.println(ans);

    }
}
