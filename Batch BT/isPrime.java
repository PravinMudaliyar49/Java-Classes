import java.util.ArrayList;

public class isPrime {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(41);

        for (int i = list.size() - 1; i >= 0; i--) {
            if (checkPrime(list.get(i))) {
                list.remove(i);
            }
        }

        System.out.println(list);

    }

    public static boolean checkPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
