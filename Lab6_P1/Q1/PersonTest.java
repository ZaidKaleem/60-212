package Lab6_P1.Q1;

import java.util.Scanner;


public class PersonTest {
    public static void main(String[] args) {

        // Variables
        String fName = "";
        String lName = "";
        String name;
        String major;
        int year;
        double salary;
        Scanner input = new Scanner(System.in); // Input
        int choice;


        System.out.println("Program Started...");

        System.out.println("Enter your first name:");
        fName = input.next();

        System.out.println("Enter your last name:");
        lName = input.next();

        name = fName + " " + lName;

        System.out.printf("Enter your birth year:");
        year = input.nextInt();

        System.out.println("If you are a student, enter 1.\nIf you are an instructor, enter 2:");
        choice = input.nextInt();

        if (choice == 1){ // If student then get major and create Student object
            System.out.println("Selected: Student");
            System.out.println("Please enter your major:");
            major = input.next();

            Student student = new Student(name, year, major);
            System.out.println(student.toString());
        }

        else if (choice == 2){ // If instructor then collect salary and create Instructor object
            System.out.println("Selected: Instructor");
            System.out.println("Enter your salary:");
            salary = input.nextDouble();
            Instructor instructor = new Instructor(name, year, salary);
            System.out.println(instructor.toString());
        }

        else System.out.printf("Invalid input.");


    }
}
