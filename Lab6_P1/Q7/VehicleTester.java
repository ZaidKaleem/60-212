package Lab6_P1.Q7;

import java.util.Scanner;


public class VehicleTester {
    public static void main(String[] args){

        //variables
        String name;
        String manName;
        int cylinders;
        double load;
        int towing;

        Scanner input = new Scanner(System.in); // input


        System.out.println("Enter Owner's name: ");
        name = input.nextLine();

        Person owner = new Person(name); //creating Person object with name

        System.out.println("Enter manufacturer's name: ");
        manName = input.next();

        System.out.println("Enter cylinders number: ");
        cylinders = input.nextInt();

        System.out.println("Enter load capacity: ");
        load = input.nextDouble();

        System.out.println("Enter towing capacity: ");
        towing= input.nextInt();

        // Creating Truck object
        Truck newTruck = new Truck (manName, cylinders, owner, load, towing);
        System.out.println(newTruck.toString());
    }
}
