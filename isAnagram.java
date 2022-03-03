package Classes;

public class isAnagram {
    public static void main(String[] args) {
        String s1 = "adcc";
        String s2 = "abdc";

        // boolean ans = isAnagramUnoptimised(s1, s2);
        boolean ans = isAnagramOptimised(s1, s2);
        System.out.println(ans);

    }

    public static boolean isAnagramUnoptimised(String s1, String s2) {
        //TIME: 0(N^N) and Space: O(N).

        if (s1.length() != s2.length()) {
            return false;
        }

        boolean[] check = new boolean[s1.length()];

        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            boolean chFound = false;

            for (int j = 0; j < s2.length(); j++) {
                char ch2 = s2.charAt(j);

                if (check[j] == false) {
                    if (ch1 == ch2) {
                        chFound = true;
                        check[j] = true;
                        break;
                    }
                }

            }

            if (chFound == false) {
                return false;
            }
        }

        return true;
    }

    public static boolean isAnagramOptimised(String s1, String s2) {
        //TIME: 0(N) and Space: O(1).
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] s1arr = new int[26];
        int[] s2arr = new int[26];

        //Bharne ka kaam
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            int asc1 = ch1;
            int asc2 = ch2;

            s1arr[asc1 - 97]++;
            s2arr[asc2 - 97]++;
        }

        //Check karne ka kaam.
        for(int i=0; i<26; i++){
            if(s1arr[i] != s2arr[i]){
                return false;
            }
        }

        return true;
    }

}
