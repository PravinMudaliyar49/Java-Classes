package Classes;

public class isAnagram {
    public static void main(String[] args) {
        String s1 = "adcc";
        String s2 = "abdc";

        boolean ans = isAnagramUnoptimised(s1, s2);
        System.out.println(ans);

    }

    public static boolean isAnagramUnoptimised(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }

        boolean[] check = new boolean[s1.length()];

        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            boolean chFound = false;

            for (int j = 0; j < s2.length(); j++) {
                char ch2 = s2.charAt(j);

                if(check[j] == false){
                    if(ch1 == ch2){
                        chFound = true;
                        check[j] = true;
                        break;
                    }
                }

            }

            if(chFound == false){
                return false;
            }
        }

        return true;
    }

}
