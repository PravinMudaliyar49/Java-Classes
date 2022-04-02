import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(25);

        System.out.println(num);
    }
}
