package Asn_3;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 3 | Part 1 - Problem 5

// Importing Scanner class to scan numbers from the user
import java.util.Scanner;

public class Five
{
    public static void main(String args [])
    {
        // Variable declarations for the three input numbers from the user
        float num1, num2, num3;
        // Scanner object to read in input
        Scanner input = new Scanner(System.in);

        System.out.println("This program identifies the lowest number from a set of three.");

        // Reading first float number
        System.out.println("Please enter the first number:");
        num1 = input.nextFloat();

        // Reading second float number
        System.out.println("Please enter the second number:");
        num2 = input.nextFloat();

        // Reading third float number
        System.out.println("Please enter the third number:");
        num3 = input.nextFloat();

        // Printing the lowest float number using the minimum3 method
        System.out.println("The lowest number is: " + minimum3(num1, num2, num3));

        }

    public static float minimum3(float n1, float n2, float n3)
    {
        // Nested Math.min method used to compare the lowest from n1 and n2 with n3
        return Math.min(Math.min(n1, n2), n3);
    }
}
