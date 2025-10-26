import random


def number_guessing_game():
    MIN_NUMBER = 1
    MAX_NUMBER = 100

    secret_number = random.randint(MIN_NUMBER, MAX_NUMBER)
    user_guess = 0
    attempts = 0

    print("Welcome to the Number Guessing Game, By Fuzayel")
    print(f"I have secretly selected a number between {MIN_NUMBER} and {MAX_NUMBER}.")
    print("Can you guess it?")

    while user_guess != secret_number:
        try:
            guess_input = input("\nEnter your guess: ")
            user_guess = int(guess_input)
            attempts += 1

            if user_guess == secret_number:
                print("\nWoohoo .. You found the correct number!!!")
                print(f"It took you {attempts} attempts to guess {secret_number}.")
            elif user_guess > secret_number:
                print("Number is too large")
            else:
                print("Number is too small")

        except ValueError:
            print("Invalid input! Please enter a valid number.")


if __name__ == "__main__":
    number_guessing_game()
