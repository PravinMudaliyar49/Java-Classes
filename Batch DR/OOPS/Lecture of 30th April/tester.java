import java.util.Random;

public class tester {
    public static void main(String[] args) {
        StartGame st = new StartGame();
        st.start();
    }
}

class Player {
    private int random;

    int showRandom() {
        return random;
    }

    void generateRandomForMe() {
        MyRandom myRandom = new MyRandom();
        random = myRandom.myRandomGeneration();
    }
}

class Bot {
    private int random;

    int showRandom() {
        return random;
    }

    void generateRandomForMe() {
        MyRandom myRandom = new MyRandom();
        random = myRandom.myRandomGeneration();
    }
}

class StartGame {
    public void start() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        Bot b = new Bot();

        while (true) {
            p1.generateRandomForMe();
            p2.generateRandomForMe();
            p3.generateRandomForMe();
            b.generateRandomForMe();

            // Not allowed:
            // p1.random = 1;
            // b.random = 1;

            System.out.println("Player1 guessed " + p1.showRandom());
            System.out.println("Player2 guessed " + p2.showRandom());
            System.out.println("Player3 guessed " + p3.showRandom());
            System.out.println("Bot guessed " + b.showRandom());

            if (p1.showRandom() == b.showRandom()) {
                System.out.println("Player1 won");
                break;

            } else if (p2.showRandom() == b.showRandom()) {
                System.out.println("Player2 won");
                break;

            } else if (p3.showRandom() == b.showRandom()) {
                System.out.println("Player3 won");
                break;

            }

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

    }
}

class MyRandom {
    int myRandomGeneration() {
        Random r = new Random();
        int val = r.nextInt(50);
        return val;
    }
}
