package Lab5;


// Zaid Kaleem
// 103619897
// Lab 5 - Part 2 | Q1

import java.util.Scanner;

public class q1 {
    public static void main(String [] args){

        // Variables
        int exponent;
        int base;
        int result;
        Scanner input = new Scanner(System.in);

        System.out.println("\tQuestion 1 --");

        // Getting base
        System.out.println("Enter the base: ");
        base = input.nextInt();

        // Getting exponent
        System.out.println("Enter the exponent");
        exponent = input.nextInt();

        result = powRecursive(base, exponent);

        System.out.println("The result is: " + result);

    }

    // Recursive method to calculate the final answer
    public static int powRecursive(int base, int exponent){

        int result;

        if (exponent == 0){
            return 1;
        }

        else if (exponent == 1){
            return base;
        }

        // Recursion
        else
            return base* powRecursive(base, exponent - 1);
    }
}
