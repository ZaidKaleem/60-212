package Lab6_P1.Q3;

import java.util.Scanner;


public class TriangleTester {
    public static void main(String[] args){

        //Variables
        Double s1, s2, s3;
        Scanner input = new Scanner(System.in); //Input

        System.out.println("Program Started...");
        System.out.printf("Please enter size of side 1: ");
        s1 = input.nextDouble();

        System.out.printf("Please enter size of side 2: ");
        s2 = input.nextDouble();

        System.out.printf("Please enter size of side 3: ");
        s3 = input.nextDouble();

        //Creating Triangle object
        Triangle triangle = new Triangle(s1, s2, s3);
        System.out.println(triangle.toString());


    }
}
