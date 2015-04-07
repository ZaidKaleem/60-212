package Asn_2;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 2 | Part 1 - Problem 3

public class Three
{
    public static void main(String args[])
    {
        int s1, s2, hyp;

        for (s1 = 1; s1 <= 500; s1++)
        {
            for (s2 = 1; s2 <= 500; s2++)
            {
                for (hyp = 1; hyp <= 500; hyp++)
                {
                    if (s1 * s1 + s2 * s2 == hyp * hyp)
                    {
                        System.out.println("Side 1: " + s1 + "\tSide 2: " + s2 + "\tHypotenuse: " + hyp);
                    }
                }
            }
        }
    }
}
