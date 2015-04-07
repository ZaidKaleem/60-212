package Asn_2;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 2 | Part 1 - Problem 1


import javax.swing.JOptionPane; // Took this statement out of the class definition

public class Arithmetic {
    public static void main( String args [] )
    {

        String firstNumber, secondNumber, thirdNumber;
        int num1,  num2, num3, sum, product, average; // Created the num1 variable

        firstNumber = JOptionPane.showInputDialog( "Enter first integer:" ); // Added " ; " and deleted one equal sign. Capitalized "o" in JoptionPane

        secondNumber = JOptionPane.showInputDialog( "Enter second integer:" ); // Added " ; " and deleted one equal sign.

        thirdNumber = JOptionPane.showInputDialog( "Enter third integer:" ); // Added " ; ", and deleted one equal sign and added a closing quotation

        num1 = Integer.parseInt( firstNumber ); // Created num1 int and removed equal sign
        num2 = Integer.parseInt( secondNumber );
        num3 = Integer.parseInt( thirdNumber );

        sum = num1 + num2 + num3;

        product = num1 * num2 * num3;

        average = ( num1 + num2 + num3 ) / 3;

        JOptionPane.showMessageDialog(null, "The sum is " + sum +
                        "\nThe product is " + product + "\nThe average is " + average,
                "Results", JOptionPane.PLAIN_MESSAGE); // Added a " . " in the JOptionPane
    }
} // end class Asn_2.Arithmetic