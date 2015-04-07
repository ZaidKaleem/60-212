package Asn_4;

/**
 * Created by ZaidK on 15-03-04.
 */

// Name: Zaid Kaleem
// ID: 103619897
// Lab 4 - Part 1 | Q8

    import java.util.Scanner;
    public class q8 {
        public static void main(String[] args) {

            char[][] seats = new char[7][4];
            for (int i = 0; i < 7; i++)
            {
                seats[i][0] = 'A';
                seats[i][1] = 'B';
                seats[i][2] = 'C';
                seats[i][3] = 'D';
            }

            Scanner console = new Scanner(System.in);
            int occupied = 0;

            displaySeats(seats);

            // Prompt for seat input, then loop until all airplaneSeats are filled
            System.out.println("Enter seat to assign (e.g., '1A')");
            String input = console.nextLine();

            while ((occupied < 28) && (input != null) && (input.length() > 0))
            {
                int rows = 0;
                int cols = 0;

                if (input.substring(0,1).equals("1")) {
                    rows = 0;
                }
                else if (input.substring(0,1).equals("2"))
                {
                    rows = 1;
                }
                else if (input.substring(0,1).equals("3"))
                {
                    rows = 2;
                }
                else if (input.substring(0,1).equals("4"))
                {
                    rows = 3;
                }
                else if (input.substring(0,1).equals("5"))
                {
                    rows = 4;
                }
                else if (input.substring(0,1).equals("6"))
                {
                    rows = 5;
                }
                else if (input.substring(0,1).equals("7"))
                {
                    rows = 6;
                }

                if (input.substring(1,2).equalsIgnoreCase("A"))
                {
                    cols = 0;
                }
                else if (input.substring(1,2).equalsIgnoreCase("B"))
                {
                    cols = 1;
                }
                else if (input.substring(1,2).equalsIgnoreCase("C"))
                {
                    cols = 2;
                }
                else if (input.substring(1,2).equalsIgnoreCase("D"))
                {
                    cols = 3;
                }

                seats[rows][cols] = 'X';


                System.out.println();

                if (occupied < 28) {
                    System.out.println("Enter seat to assign (e.g., '1A'), ");
                    console.nextLine();
                    input = console.nextLine();
                }
            }

            System.out.println("Final seat assignments: ");
            displaySeats(seats);

        }

        private static void displaySeats(char[][] seats)
        {
            for (int i = 0; i < seats.length; i++)
            {
                System.out.println((i + 1) + "   " +
                        seats[i][0] + " " + seats[i][1] + "  " +
                        seats[i][2] + " " + seats[i][3]);
            }
        }
    }

