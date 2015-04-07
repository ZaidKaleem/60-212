package Asn_3;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 3 | Part 1 - Problem 6

import java.util.Random;
import java.util.Scanner;

public class Six {
    public static void main(String args []){

        // Random type object to generate random numbers
        Random rand = new Random();

        // Scanner object to scan input from user
        Scanner input = new Scanner(System.in);

        // Variable declaration for the random number
        int n;

        // Variable declaration for user's input
        int guess;

        String retry;

        System.out.println("** Game Started **");

        // Infinite loop to keep the game running
        while (true)
        {
            // Generating a new random number and assigning to n
            n = rand.nextInt(1000) + 1;

            // Checking if guess is too high or too low
            do
            {
                System.out.printf("\nGuess a number between 1 and 1000: ");
                guess = input.nextInt();

                if (guess > n)
                    System.out.println("Too high. Try again.");
                if (guess < n)
                    System.out.println("Too low. Try again.");
            }
            while (guess != n);

            // If the user guesses the number correctly...
            if (guess == n)
                System.out.println("Congratulations. You guessed the number!");

            // Asking if user would like to play the game again
            System.out.println("");
            System.out.printf("Would you like to play again? (y/n): ");
            retry = input.next();

            // If user does not want to play game again...
            if (retry.equals("n") == true)
            {
                System.out.printf("Game Closed");
                break;
            }

            System.out.println("");
            System.out.println("** Game Restarted **");
        }
    }
}