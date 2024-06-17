import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int numberToGuess = generator.nextInt(10) + 1;
        int guess = 0;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (in.hasNextInt()) {
                guess = in.nextInt();
                in.nextLine(); // clears the newline from the buffer
                if (guess < 1 || guess > 10) {
                    System.out.println("Invalid input! Please enter a valid number.");
                } else {
                    break;
                }
            } else {
                String trash = in.nextLine();
                System.out.println("Invalid input! Please enter a valid number.");
            }
        } while (true);

        System.out.println("The number was " + numberToGuess + ".");

        if (guess == numberToGuess) {
            System.out.println("You got it!");
        } else if (guess > numberToGuess) {
            System.out.println("Your guess was too high!");
        } else {
            System.out.println("Your guess was too low!");
        }
    }
}