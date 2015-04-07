package Asn_2;

// Name: Zaid Kaleem
// ID: 103619897
// Lab 2 | Part 1 - Problem 2

import java.util.Scanner;

public class Two
{
    public static void main(String args [])
    {
        int markCount;
        int courseNumber = 1;

        int gradeAplus = 0;
        int gradeA = 0;
        int gradeAminus = 0;

        int gradeBplus = 0;
        int gradeB = 0;
        int gradeBminus = 0;

        int gradeCplus = 0;
        int gradeC = 0;
        int gradeCminus = 0;

        int gradeDplus = 0;
        int gradeD = 0;
        int gradeDminus = 0;

        int gradeFplus = 0;
        int gradeF = 0;
        int gradeFminus = 0;

        double [] markArray = new double[5];
        double average;

        String name,id;
        String [] gradeArray = new String[5];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        name = input.nextLine();

        System.out.println("Enter your ID: ");
        id = input.nextLine();

        for (markCount = 0; markCount < 5; markCount++)
        {
            System.out.println("Enter your mark in Course " + courseNumber);
            markArray[markCount] = input.nextInt();

            courseNumber++;
        }

        average = ( markArray[0] + markArray[1] + markArray[2] + markArray[3] + markArray[4] ) / 5;

        for (markCount = 0; markCount < 5; markCount++)
        {
            if (markArray[markCount] >= 95)
                gradeArray[markCount] = "A+";

            if (markArray[markCount] >= 90 && markArray[markCount] <= 94.9)
                gradeArray[markCount] = "A";

            if (markArray[markCount] >= 85 && markArray[markCount] <= 89.9)
                gradeArray[markCount] = "A-";

            if (markArray[markCount] >= 80 && markArray[markCount] <= 84.9)
                gradeArray[markCount] = "B+";

            if (markArray[markCount] >= 77 && markArray[markCount] <= 79.9)
                gradeArray[markCount] = "B";

            if (markArray[markCount] >= 73 && markArray[markCount] <= 76.9)
                gradeArray[markCount] = "B-";

            if (markArray[markCount] >= 70 && markArray[markCount] <= 72.9)
                gradeArray[markCount] = "C+";

            if (markArray[markCount] >= 67 && markArray[markCount] <= 69.9)
                gradeArray[markCount] = "C";

            if (markArray[markCount] >= 63 && markArray[markCount] <= 66.9)
                gradeArray[markCount] = "C-";

            if (markArray[markCount] >= 60 && markArray[markCount] <= 62.9)
                gradeArray[markCount] = "D+";

            if (markArray[markCount] >= 56 && markArray[markCount] <= 59.9)
                gradeArray[markCount] = "D";

            if (markArray[markCount] >= 50 && markArray[markCount] <= 55.9)
                gradeArray[markCount] = "D-";

            if (markArray[markCount] >= 45 && markArray[markCount] <= 49.9)
                gradeArray[markCount] = "F+";

            if (markArray[markCount] >= 40 && markArray[markCount] <= 44.9)
                gradeArray[markCount] = "F";

            if (markArray[markCount] >= 35 && markArray[markCount] <= 39.9)
                gradeArray[markCount] = "F-";

            if (markArray[markCount] <= 35)
                gradeArray[markCount] = "F-";
        }

        for (markCount = 0; markCount < 5; markCount++)
        {
            if (gradeArray[markCount] == "A+")
                gradeAplus++;
            if (gradeArray[markCount] == "A")
                gradeA++;
            if (gradeArray[markCount] == "A-")
                gradeAminus++;

            if (gradeArray[markCount] == "B+")
                gradeBplus++;
            if (gradeArray[markCount] == "B")
                gradeB++;
            if (gradeArray[markCount] == "B-")
                gradeBminus++;

            if (gradeArray[markCount] == "C+")
                gradeCplus++;
            if (gradeArray[markCount] == "C")
                gradeC++;
            if (gradeArray[markCount] == "C-")
                gradeCminus++;

            if (gradeArray[markCount] == "D+")
                gradeDplus++;
            if (gradeArray[markCount] == "D")
                gradeD++;
            if (gradeArray[markCount] == "D-")
                gradeDminus++;

            if (gradeArray[markCount] == "F+")
                gradeFplus++;
            if (gradeArray[markCount] == "F")
                gradeF++;
            if (gradeArray[markCount] == "F-")
                gradeFminus++;
        }

        System.out.println("");

        System.out.println("\t\tResults");

        System.out.println("");

        System.out.println("Student Name:\t" + name);
        System.out.println("Student ID:\t\t" + id);

        System.out.println("");

        System.out.println("Course #\tMark\tGrade");
        System.out.println("\t1)\t\t" + markArray[0] + "\t" + gradeArray[0]);
        System.out.println("\t2)\t\t" + markArray[1] + "\t" + gradeArray[1]);
        System.out.println("\t3)\t\t" + markArray[2] + "\t" + gradeArray[2]);
        System.out.println("\t4)\t\t" + markArray[3] + "\t" + gradeArray[3]);
        System.out.println("\t5)\t\t" + markArray[4] + "\t" + gradeArray[4]);

        System.out.println("");

        System.out.println("Average:\t" + average);

        System.out.println("");

        System.out.println("Number of courses in each letter grade:");
        System.out.println("A+ :\t" + gradeAplus);
        System.out.println("A :\t\t" + gradeA);
        System.out.println("A- :\t" + gradeAminus);

        System.out.println("");

        System.out.println("B+ :\t" + gradeBplus);
        System.out.println("B :\t\t" + gradeB);
        System.out.println("B- :\t" + gradeBminus);

        System.out.println("");

        System.out.println("C+ :\t" + gradeCplus);
        System.out.println("C :\t\t" + gradeC);
        System.out.println("C- :\t" + gradeCminus);

        System.out.println("");

        System.out.println("D+ :\t" + gradeDplus);
        System.out.println("D :\t\t" + gradeD);
        System.out.println("D- :\t" + gradeDminus);

        System.out.println("");

        System.out.println("F+ :\t" + gradeFplus);
        System.out.println("F :\t\t" + gradeF);
        System.out.println("F- :\t" + gradeFminus);

    }
}
