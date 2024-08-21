package com.coderscampus.assignment2;

public class NumberGuessingGame {

    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int attempts = 5;

        while (attempts-- > 0) {
            int userGuess = promptUserForGuess("Enter a number between 1 and 100: ");

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
                attempts++; 
                continue;
            }

            if (userGuess == targetNumber) {
                System.out.println("Congratulations! You've guessed the correct number!");
                return;
            }

            System.out.println(userGuess < targetNumber ? "Guess higher!" : "Guess lower!");
        }

        System.out.println("Game over! The correct number was: " + targetNumber);
    }

    @SuppressWarnings("resource")
    private static int promptUserForGuess(String message) {
        System.out.print(message);
        return new java.util.Scanner(System.in).nextInt();
    }
}
