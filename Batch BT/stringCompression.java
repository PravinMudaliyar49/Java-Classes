public class stringCompression {
    public static void main(String[] args) {
        String str = "aaabbbcdeeff";
        StringBuilder ans = new StringBuilder(str.charAt(0) + "");

        for (int i = 1; i < str.length(); i++) {
            char currChar = str.charAt(i);
            char prevChar = str.charAt(i - 1);

            if (currChar != prevChar) {
                ans.append(currChar);
            }

        }

        System.out.println(ans);

        ans = new StringBuilder(str.charAt(0) + "");
        int count = 1;

        for (int i = 1; i < str.length(); i++, count++) {

            if (str.charAt(i - 1) != str.charAt(i)) {
                if (count != 1) {
                    ans.append(count);
                }

                ans.append(str.charAt(i));
                count = 0;
            }
        }

        if (count != 0) {
            ans.append(count);
        }

        System.out.println(ans);

    }
}
