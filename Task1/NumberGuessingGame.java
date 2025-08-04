import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalRounds = 0;
        int roundsWon = 0;

        System.out.println("Welcome to the Number Guessing Game! ");

        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = rand.nextInt(100) + 1;
            int attemptsLeft = 7;
            boolean hasGuessedCorrectly = false;

            totalRounds++;
            System.out.println("\nRound " + totalRounds + " has started!");
            System.out.println("Guess the number between 1 to 100");
            System.out.println("You have " + attemptsLeft + " attempts\n");

            while (attemptsLeft > 0) {
                System.out.print("👉 Enter your guess: ");
                int guess;

                // Input validation
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number.");
                    sc.next(); // discard invalid input
                    continue;
                }

                guess = sc.nextInt();
                attemptsLeft--;

                if (guess < numberToGuess) {
                    System.out.println("Too low, think bigger!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high, think smaller!");
                } else {
                    System.out.println("Correct! You guessed the number!");
                    System.out.println("Attempts used: " + (7 - attemptsLeft));
                    hasGuessedCorrectly = true;
                    roundsWon++;
                    break; // exit guessing loop
                }

                System.out.println("Attempts left: " + attemptsLeft + "\n");
            }

            if (!hasGuessedCorrectly) {
                System.out.println("You've used all attempts. The number was: " + numberToGuess);
            }

            // Ask to play again
            System.out.print("\nDo you want to play another round? (yes/no): ");
            sc.nextLine(); // consume newline
            String response = sc.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
        }

        // Final summary
        System.out.println("\nGame Over!");
        System.out.println("Total Rounds Played: " + totalRounds);
        System.out.println("Rounds Won: " + roundsWon);
        sc.close();
    }
}
