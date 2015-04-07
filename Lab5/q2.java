package Lab5;

// Zaid Kaleem
// 103619897
// Lab 5 - Part 2 | Q2

import java.util.Scanner;

public class q2 {
    public static void main(String [] args)
    {

        int exponent;
        int base;
        int result;
        Scanner input = new Scanner(System.in);

        System.out.println("Question 2");

        // Getting the base
        System.out.println("Enter the base: ");
        base = input.nextInt();

        // Getting the exponent
        System.out.println("Enter the exponent");
        exponent = input.nextInt();

        result = powRecursive(base, exponent);

        System.out.println("The result is: " + result);

    }

    // Recursive method to calculate the final result
    public static int powRecursive(int base, int exponent)
    {

        int result;

        if (exponent == 1)
        {
            return base;
        }

        // If exponent is even...Q2 condition
        else if (exponent % 2 == 0)
        {
            return powRecursive(base, exponent / 2) * powRecursive(base, exponent / 2);
        }

        else if (exponent == 0)
        {
            return 1;
        }

        else
            return base* powRecursive(base, exponent - 1);
    }
}
