package Lab5;

// Zaid Kaleem
// 103619897
// Lab 5 - Part 2 | Q5

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double i;

        System.out.println("Enter a value for i: ");
        i = input.nextDouble();

        // Calling the m method to sum up the fractions
        double j = m(i);

        System.out.println("Sum is: " + j);

    }

    // Method to sum up all the fractions up to 1 + ... 1/i
    public static double m(double i) {

        if (i < 1)
            return 0.0;
        else if (i==0){
            return 1.0;
        }
        //Recursion
        return (1/i + m(i-1));
    }

}
