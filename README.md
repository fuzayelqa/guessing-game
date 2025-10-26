## Number Guessing Game ##
Description

This is a simple Number Guessing Game available in both Python and Java.
The program generates a random number, and the user tries to guess it. The program provides hints if the guess is too high or too low, and congratulates the user when they guess correctly.

How It Works

The system generates a random number between 1 and 100.

The user is prompted to input their guess.

The program compares the user's guess to the random number:

If the guess matches the number, the program prints:
"Woohoo! You found the correct number!!!"

If the guess is greater than the number, the program prints:
"Number is too large"

If the guess is smaller than the number, the program prints:
"Number is too small"

The user continues guessing until the correct number is found.

Requirements

Python Version: Python 3.x

Java Version: JDK 8 or later

Python Version

File: number_guessing.py

Code Example:

import random

def number_guessing_game():
    number_to_guess = random.randint(1, 100)
    guess = None

    print("Welcome to the Number Guessing Game!")
    print("Guess a number between 1 and 100.")

    while guess != number_to_guess:
        try:
            guess = int(input("Enter your guess: "))
            if guess < number_to_guess:
                print("Number is too small")
            elif guess > number_to_guess:
                print("Number is too large")
            else:
                print("Woohoo! You found the correct number!!!")
        except ValueError:
            print("Please enter a valid integer.")

if __name__ == "__main__":
    number_guessing_game()


How to Run (Python):

python number_guessing.py

Java Version

File: NumberGuessing.java

Code Example:

import java.util.Scanner;
import java.util.Random;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess < numberToGuess) {
                    System.out.println("Number is too small");
                } else if (guess > numberToGuess) {
                    System.out.println("Number is too large");
                } else {
                    System.out.println("Woohoo! You found the correct number!!!");
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }

        scanner.close();
    }
}


How to Run (Java):

javac NumberGuessing.java
java NumberGuessing

Features

Interactive console game

Validates user input

Provides hints if the guess is too high or low

Works in both Python and Java
