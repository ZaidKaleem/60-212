package Asn_4;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 4 - Part 1 | Q5


import java.util.Scanner;

public class q5 {
    public static void main(String [] args){

        // Variables
        double[] score = new double[7];
        double highest, lowest;
        double scoreSum = 0;
        double difficulty;
        double total;
        double finalScore;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the level of difficulty (1.2 - 3.8): ");
        difficulty = input.nextDouble();

        // Checking if difficulty is valid
        if (difficulty < 1.2 || difficulty > 3.8) {
            System.out.println("Difficulty can only be between 1.2 and 3.8\nProgram closed.");
            return;
        }

        // Scanning judge scores
        for (int i = 1; i <= score.length; i++){
            System.out.println("Enter Judge " + i + "'s score (0 - 10):");
            score[i-1] = input.nextDouble();

            // Checking score validity
            if (score[i-1] < 0 || score[i-1] > 10){
                System.out.println("Judge scores can only be between 0 and 10.\nProgram closed.");
                return;
            }
        }

        // Getting the highest score
        highest = max(score);

        // Getting the lowest score
        lowest = min(score);

        // Deleting highest/lowest score and adding the rest
        for (int i = 0; i < score.length; i++){
            if (score[i] == highest || score[i] == lowest)
                score[i] = 0;
            scoreSum += score[i];
        }

        total = scoreSum * difficulty;

        finalScore = total * 0.6;

        System.out.println("Final score is: " + finalScore);

    }

    // Method to identify the highest judge score
    static double max(double score[]) {

        double highest = 0;

        for (int i = 0; i < score.length; i++) {
            if (highest < score[i])
                highest = score[i];
        }

        return highest;
    }


    // Method to identify the lowest judge score
    static double min(double score[]){

        double lowest = 10;

        for (int i = 0; i < score.length; i++) {
            if (lowest > score[i])
                lowest = score[i];
        }

        return lowest;
    }
}
