package Asn_4;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 4 - Part 1 | Q4


import java.util.Random;

public class q4 {

    static Random r = new Random();
    static final int SIDES = 6;
    static final int REPETITIONS = 36000000;

    public static void main(String[] args)
    {
        int[] frequency = count(REPETITIONS);
        System.out.println("Sum\t   Repetitions");
        System.out.println("-----------------------");
        printFrequency(frequency);
    }

    // Method counts the number of times each sum of two dice rolls occurs in 36 million repetitions
    static int[] count(int repetitions)
    {
        // Max sum of two dice
        int max = SIDES + SIDES;
        int[] result = new int[max + 1];
        for(int i = 0; i < repetitions; i++)
        {
            ++result[twoDice()];
        }
        return result;
    }

    // Method that rolls two dice and sums up the total
    static int twoDice()
    {
        return dice() + dice();
    }

    // Method to roll a dice using random number generator
    static int dice()
    {
        return 1 + r.nextInt(SIDES);
    }

    // Method prints the possible sums and their frequency
    static void printFrequency(int[] frequency)
    {
        int min = 2;
        for(int i = min; i < frequency.length; i++)
        {
            System.out.printf("%4d%10d\n", i, frequency[i]);
        }
    }
}