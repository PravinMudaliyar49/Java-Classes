import java.util.*;

public class random {
    public static void main(String[] args) {
        // Random random = new Random();

        // int minBound = 25;
        // int maxBound = 80;

        // int val = random.nextInt(maxBound - minBound);

        // int randomVal = minBound + val;

        // System.out.println(randomVal);

        double randomVal = (int) Math.ceil(Math.random() * 100);
        System.out.println(randomVal);

    }
}