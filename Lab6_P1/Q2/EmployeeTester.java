package Lab6_P1.Q2;

import java.util.Scanner;


public class EmployeeTester {
    public static void main(String [] args){

        //Variables
        String fName;
        String lName;
        String name;
        double salary;
        String department;
        Scanner input = new Scanner(System.in); // Input
        int choice;

        System.out.println("Program Started...");

        System.out.println("Enter your first name: ");
        fName = input.next();

        System.out.println("Enter your last name: ");
        lName = input.next();

        name = fName + " " + lName;

        System.out.println("Enter your salary: ");
        salary = input.nextDouble();

        System.out.printf("Enter your department name: ");
        department = input.next();

        System.out.println("Manager? Enter 1\nExecutive? Enter 2: ");
        choice = input.nextInt();

        if (choice == 1) { // Choice for manager, creating Manager object

            Manager manager = new Manager(name, salary, department);
            System.out.println(manager.toString());
        }

        else if (choice == 2){ // Choice for executive, creating Executive object
            Executive executive = new Executive(name, salary, department);
            System.out.println(executive.toString());
        }

        else System.out.println("Invalid Input. Program Closed.");
    }
}
