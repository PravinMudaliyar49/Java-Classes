import java.util.Random;

public class guessingGame {

}

class StartGame {
    public static void main(String[] args) {
        ComputerGuess computer = new ComputerGuess();
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        while (true) {
            player1.guessNum();
            player2.guessNum();
            player3.guessNum();

            computer.guessNum();

            int guess1 = player1.playerGuess;
            int guess2 = player2.playerGuess;
            int guess3 = player3.playerGuess;
            int compGuess = computer.computerGuess;

            printGuesses(guess1, guess2, guess3, compGuess);

            if (guess1 == compGuess) {
                System.out.println("Player 1 guessed it right.");
                break;
            } else if (guess2 == compGuess) {
                System.out.println("Player 2 guessed it right.");
                break;
            } else if (guess3 == compGuess) {
                System.out.println("Player 3 guessed it right.");
                break;
            }
        }

    }

    public static void printGuesses(int guess1, int guess2, int guess3, int compGuess) {
        System.out.println("Player1 guessed: " + guess1 + ". Player2 guessed: " + guess2 + ". Player3 guessed: "
                + guess3 + ".");
        System.out.println("Computer guesses: " + compGuess);

        System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~` ");
    }
}

class ComputerGuess {
    int computerGuess;

    public void guessNum() {
        int guess = new Random().nextInt(50);
        computerGuess = guess;
    }
}

class Player {
    int playerGuess;

    public void guessNum() {
        int guess = new Random().nextInt(50);
        playerGuess = guess;
    }

}