package Asn_2;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 2 | Part 1 - Problem 6

public class Messy
{
    public static final double DISTANCE = 6.21;

    public static void main(String[] args)
    {
        final double TIME = 35.5; /* 35 minutes and 30 seconds */
        final double PACE = TIME / DISTANCE;

        System.out.println("This program calculates your pace given a time and distance traveled.");

        System.out.println("Your pace is " + PACE + " miles per hour.");
    }

}
