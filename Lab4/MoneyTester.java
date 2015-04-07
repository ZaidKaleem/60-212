package Lab4;

import java.util.Scanner;

public class MoneyTester {

    public static void main(String[] args) {

        System.out.println("Add function running...");
        sum();

        System.out.println("Subtract function running...");
        subtract();

    }

    // Method to add two amounts
    public static void sum() {

        int d1, c1;
        int d2, c2;

        Scanner input = new Scanner(System.in);

        System.out.println("Amount 1 - Enter Dollars: ");
        d1 = input.nextInt();
        System.out.println("Amount 1 - Enter Cents: ");
        c1 = input.nextInt();

        System.out.println("Amount 2 - Enter Dollars: ");
        d2 = input.nextInt();
        System.out.println("Amount 2 - Enter Cents: ");
        c2 = input.nextInt();

        Money a1 = new Money(d1, c1);
        Money a2 = new Money(d2, c2);

        Money obj = new Money();
        obj = Money.add(a1, a2);

        System.out.println("Sum is: " + obj.d + "." + obj.c);
    }

    // Method to subtract two amounts
    public static void subtract() {

        int d1, c1;
        int d2, c2;

        Scanner input = new Scanner(System.in);

        System.out.println("Amount 1 - Enter Dollars: ");
        d1 = input.nextInt();
        System.out.println("Amount 1 - Enter Cents: ");
        c1 = input.nextInt();

        System.out.println("Amount 2 - Enter Dollars: ");
        d2 = input.nextInt();
        System.out.println("Amount 2 - Enter Cents: ");
        c2 = input.nextInt();

        Money a1 = new Money(d1, c1);
        Money a2 = new Money(d2, c2);

        Money obj = new Money();
        obj = Money.sub(a1, a2);

        System.out.println("Subtraction is: " + obj.d + "." + obj.c);
    }



}