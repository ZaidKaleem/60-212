package Asn_4;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 4 - Part 1 | Q3

import java.util.Scanner;
import java.util.Arrays;

public class q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("  --- Jump It! ---");
        System.out.println("Enter the length of the game board: ");

        int size = input.nextInt();
        int[] board = new int[size];

        // First cell in the board is always 0
        board[0] = 0;

        // Getting the cost for each cell on the board
        for (int i = 1; i < size; i++) {
            System.out.print("Please enter the element in the " );
            System.out.print(i + 1);
            System.out.println(" position:");

            board[i] = input.nextInt();
        }

        System.out.println("Game Board: " + Arrays.toString(board) );
        System.out.println("The least costly route to the end of the board is: " + minCost(board, 0) );
    }

    // Method calculates the least costly route to the end of the board
    public static int minCost(int[] board, int n) {

        if(board.length - 1  == n)
            return board[n];
        else if(board.length - 2 == n)
            return board[0] + board[board.length - 1];
        else if(minCost(board, n + 1) < minCost(board, n + 2))
            return board[n] + minCost(board, n + 1);
        else
            return board[n] + minCost(board, n + 2);
    }
}