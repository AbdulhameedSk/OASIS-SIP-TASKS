import java.util.*;

public class NumberGussingGame {
    public static void chance(int guess, int secretNumber) {
        Scanner sc = new Scanner(System.in);
        int attempts = 3;
        while (attempts > 0) {
            if (guess < secretNumber) {
                System.out.println("Your guess is less.");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is more.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                break;
            }
            guess = sc.nextInt();
            --attempts;
            System.out.println("You have " + attempts + " attempts remaining");
        }
    }

    public static void main(String[] args) {
        int attempts = 3;
        int score = 15;
        int guess = 0;
        int chance = 3;
        Scanner sc = new Scanner(System.in);

        System.out.println("You have " + attempts + " attempts.");
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + 4 + " attempts to guess it.");

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        System.out.println("Enter your guess: ");
        guess = sc.nextInt();
        // while (attempts > 0) {

        chance(guess, secretNumber);
        score /= 3;

        System.out.println("Do you want to continue? (yes or no)");
        String opinion = sc.next();
        opinion = opinion.toLowerCase();
        if (opinion.equals("no")) {
            // break;
        } else {
            chance(guess, secretNumber);
        }

        // Close the scanner after all input has been read
        sc.close();

        if (attempts == 0) {
            System.out.println("Sorry, you ran out of attempts.");
            System.out.println("The secret number was " + secretNumber);
        }
        System.out.println("SCORE IS " + score);
    }
}
