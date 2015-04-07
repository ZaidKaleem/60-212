package Asn_2;


// Name: Zaid Kaleem
// ID: 103619897
// Lab 2 | Part 1 - Problem 4


public class Four {

    public static void first()
    {
        int n = 10;
        int c, k;

        for (c = 0; c < n; c++) {
            for (k = 0; k <= c; k++)
                System.out.printf("*");

            System.out.printf("\n");
        }
    }

    public static void second()
    {
        int n = 10;
        int c, k;
        int t = 10;

        for (c = 0; c < n; c++) {
            for (k = 0; k < t; k++)
                System.out.printf("*");

            System.out.printf("\n");
            t--;
        }
    }



    public static void main(String args[])
    {
        first();

        System.out.printf("\n");

        second();

    }
}