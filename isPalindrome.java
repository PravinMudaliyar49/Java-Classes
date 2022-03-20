public class isPalindrome {
    public static void main(String[] args) {
        String str = "nitin";
        boolean ans = isPalindromeCheck(str);

        System.out.println(ans);
    }

    public static boolean isPalindromeCheck(String str) {
        int i = 0, j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
