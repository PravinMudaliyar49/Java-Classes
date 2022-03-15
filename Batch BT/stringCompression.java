public class stringCompression {
    public static void main(String[] args) {
        String str = "aaabbbccdeffg";
        StringBuilder ans = new StringBuilder(str.charAt(0) + "");

        for (int i = 1; i < str.length(); i++) {
            char currChar = str.charAt(i);
            char prevChar = str.charAt(i - 1);

            if (currChar != prevChar) {
                ans.append(currChar);
            }

        }

        System.out.println(ans);


    }
}
