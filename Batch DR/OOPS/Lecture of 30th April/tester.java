import java.util.Random;

public class tester {
    public static void main(String[] args) {
        StartGame st = new StartGame();
        st.start();
    }
}

class Player {
    private int random;
    String name;

    int showRandom() {
        return random;
    }

    void generateRandomForPlayer() {
        MyRandom myRandom = new MyRandom();
        random = myRandom.myRandomGeneration();
    }
}

class Bot {
    private int random;

    int showRandom() {
        return random;
    }

    void generateRandomForBot() {
        MyRandom myRandom = new MyRandom();
        random = myRandom.myRandomGeneration();
    }
}

class StartGame {
    public void start() {
        Player p1 = new Player();
        p1.name = "Dhruv";

        Player p2 = new Player();
        p2.name = "Rushikesh";

        Player p3 = new Player();
        p3.name = "Pravin";

        Bot b = new Bot();

        while (true) {
            p1.generateRandomForPlayer();
            p2.generateRandomForPlayer();
            p3.generateRandomForPlayer();
            b.generateRandomForBot();

            // Not allowed:
            // p1.random = 1;
            // b.random = 1;

            System.out.println("Player1 guessed " + p1.showRandom());
            System.out.println("Player2 guessed " + p2.showRandom());
            System.out.println("Player3 guessed " + p3.showRandom());
            System.out.println("Bot guessed " + b.showRandom());

            if (p1.showRandom() == b.showRandom()) {
                System.out.println(p1.name + " won.");
                break;
                
            } else if (p2.showRandom() == b.showRandom()) {
                System.out.println(p2.name + " won.");
                break;
                
            } else if (p3.showRandom() == b.showRandom()) {
                System.out.println(p3.name + " won.");
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
