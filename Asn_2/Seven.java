package Asn_2;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 2 | Part 1 - Problem 7


import javax.swing.JOptionPane;

public class Seven {
    public static void main(String args [])
    {
        String feet, inches;

        int ft, in, weight, weightIn, diff, diffIn, weightDiffIn;

        feet = JOptionPane.showInputDialog("Input just the feet of your height:");
        inches = JOptionPane.showInputDialog("Input the remaining inches of your height");

        ft = Integer.parseInt(feet);
        in = Integer.parseInt(inches);

        if (ft == 5)
        {
            weight = 110;

            weightIn = in * 5;

            weight += weightIn;

            JOptionPane.showMessageDialog(null, "Ideal body weight for your height is " + weight);
        }


        if (ft > 5)
        {
            weight = 110;

            diff = ft - 5;

            diffIn = diff * 12;

            weightDiffIn = diffIn * 5;

            weightIn = in * 5;

            weight += weightDiffIn + weightIn;

            JOptionPane.showMessageDialog(null, "Ideal body weight for your height is " + weight);
        }
    }
}
