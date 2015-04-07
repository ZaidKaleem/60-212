package Asn_4;

import java.util.Scanner;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 4 - Part 1 | Q1

public class q1 {
    public static void main(String [] args){

        int x,y;
        Scanner input = new Scanner(System.in);

        System.out.println("This program calculates the gcd(x,y) recursively.");

        System.out.println("Please enter a value for x:");
        x = input.nextInt();

        System.out.println("Please enter a value for y:");
        y = input.nextInt();

        System.out.println("The gcd(x,y) is: " + gcd(x, y));
    }

    // Method to calculate gcd recursively
    public static int gcd(int x, int y) {

        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }
}
