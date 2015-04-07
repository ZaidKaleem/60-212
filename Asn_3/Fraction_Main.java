package Asn_3;

/**
 * Created by ZaidK on 15-02-08.
 */

// Name: Zaid Kaleem
// ID: 103619897
// Lab 3 | Part 1 - Problem 3

import java.util.Scanner;
public class Fraction_Main {
    public static void main(String args []){

        int num, den;
        Scanner input = new Scanner(System.in);
        Fraction myFraction = new Fraction();

        // Input for numerator and changing it in object
        System.out.println("Enter numerator:");
        num = input.nextInt();
        myFraction.setNum(num);

        // Input for denominator and changing it in object
        System.out.println("Enter denominator:");
        den = input.nextInt();
        myFraction.setDen(den);

        System.out.println("");

        // Displays the division in double type
        myFraction.division();

        // Displays the fraction in lowest terms
        myFraction.lowest();

    }
}


class Fraction{

    int numerator = 0;
    int denominator = 1;

    // Sets the numerator to variable num from main class
    public void setNum(int newNum){
        numerator = newNum;
    }

    // Sets the denominator to variable den from main class
    public void setDen(int newDen){
        denominator = newDen;
    }

    // Divides the numerator and denominator and returns answer in type double
    public void division(){
        int a = numerator;
        int b = denominator;

        double d = (double)a/(double)b;
        System.out.printf("%.2f\n", d);
    }

    // Calculates the GCD of the numerator and the denominator
    public int GCD(int numerator, int denominator){

        int a = numerator;
        int b = denominator;

        if (b==0) return a;
            return GCD(b,a%b);
    }

    // Calculates the fraction's lowest terms and prints in a fraction format
    public void lowest(){

        int l = GCD(numerator, denominator);

        System.out.println(numerator/l + "/" + denominator/l);
    }


}