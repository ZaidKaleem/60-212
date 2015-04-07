package Asn_2;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 2 | Part 1 - Problem 5


import javax.swing.JOptionPane;

public class Five {
    public static void main(String args[])
    {
        String seconds;
        int hr, min, sec, r;

        seconds = JOptionPane.showInputDialog("Enter time in seconds to convert:");

        sec = Integer.parseInt(seconds);

        hr = sec/3600;
        r = sec % 3600;

        min = r/60;
        sec = r % 60;

        JOptionPane.showMessageDialog(null, hr + " hours, " + min +" minutes, " + sec + " seconds.");

    }
}
