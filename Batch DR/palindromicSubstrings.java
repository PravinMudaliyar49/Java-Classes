import java.util.*;

public class palindromicSubstrings{
    public static void solution(String str){

		for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {

                String sub = str.substring(i, j + 1);

				boolean isPalindrome = isPalindromeCheck(sub);

				if(isPalindrome == true){
	                System.out.println(sub);
				}
            }
        }
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

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
}