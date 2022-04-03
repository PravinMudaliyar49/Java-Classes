import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        
        // int num = random.nextInt(end);
        // System.out.println(num);

        // int start = 30, end = 100;
        // int x = end - start;

        // int val = random.nextInt(x);
        // val += start + 1;

        double val = Math.random();

        System.out.println(val * 100);
    }
}
