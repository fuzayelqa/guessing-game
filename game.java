import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int MIN_NUMBER = 1;
        final int MAX_NUMBER = 100;

        int secretNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        int userGuess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game, By Fuzayel");
        System.out.println("I have secretly selected a number between " + MIN_NUMBER + " and " + MAX_NUMBER + ".");
        System.out.println("Can you guess it?");

        while (userGuess != secretNumber) {
            System.out.print("\nEnter your guess: ");

            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == secretNumber) {
                    System.out.println("\nWoohoo .. You found the correct number!!!");
                    System.out.println("It took you " + attempts + " attempts to guess " + secretNumber + ".");
                } else if (userGuess > secretNumber) {
                    System.out.println("Number is too large");
                } else {
                    System.out.println("Number is too small");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); 
            }
        }
        scanner.close();
    }
}
