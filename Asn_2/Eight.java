package Asn_2;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 2 | Part 1 - Problem 8


import javax.swing.JOptionPane;

public class Eight
{
    public static void main(String[] args)
    {
        String input;

        input = JOptionPane.showInputDialog("Enter a sentence: ");

        JOptionPane.showMessageDialog(null, input, "The line of text to be changed is...", JOptionPane.PLAIN_MESSAGE);

        String result = input.replaceFirst("hate", "love");

        JOptionPane.showMessageDialog(null, result, "I have rephrased that line to read...", JOptionPane.PLAIN_MESSAGE);
    }
}


