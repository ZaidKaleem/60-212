package Asn_4;

import java.util.Scanner;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 4 - Part 1 | Q2

public class q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("This program checks if the input string is a palindrome.");
        System.out.print("Enter a string to check: ");
        String string = input.nextLine();

        if(test(string))
            System.out.println(">> It's a Palindrome <<");
        else
            System.out.println(">> It's not a Palindrome <<");
    }

    // Method to test if the string is a palindrome
    static boolean test(String string){
        if(string.length()==0 || string.length()==1){
            return true;
        }

        // Removing punctuation and blank spaces
        string=string.toLowerCase().replaceAll(" ", "");
        string=string.toLowerCase().replaceAll(",", "");
        string=string.toLowerCase().replaceAll("-", "");


        if(string.charAt(0)==string.charAt(string.length()-1))
            return test(string.substring(1, string.length() - 1));
        return false;
    }
}
