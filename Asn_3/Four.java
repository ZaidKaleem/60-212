package Asn_3;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 3 | Part 1 - Problem 4

import java.util.Scanner;

public class Four {
    public static void main(String args []){

        // Variable declaration for side and Scanner object
        int side;
        Scanner input = new Scanner(System.in);

        System.out.println("This program displays a solid square (the same number of rows and\n" +
                "columns) of asterisks whose side is specified in integer parameter side.");

        // User input for sides
        System.out.printf("\nEnter an integer number for the sides: ");
        side = input.nextInt();

        squareOfAsterisks(side);
    }

    // Method declaration to print square of asterisks
    public static void squareOfAsterisks(int s)
    {
        System.out.println("");

        // Loop to go through rows
        for (int r = 0; r < s; r++)
        {
            // Loop to go through columns
            for (int c = 0; c < s; c++)
                System.out.printf("*");
            System.out.println("");
        }
    }
}
