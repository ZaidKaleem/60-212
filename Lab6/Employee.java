// Zaid Kaleem
// 103619897
// Lab 6 | Part 2

package Lab6;

import java.text.DecimalFormat;
import java.util.Scanner;


//Employee.java
public class Employee
{
    String name;             // Employee name
    String employeeNumber;   // Employee number
    String hireDate;         // Employee hire date


    // This constructor requires a name, employee number, and hire date.

    public Employee(String n, String e, String h)
    {
        name = n;
        setEmployeeNumber(e);
        hireDate = h;
    }


    // No argument constructor
    public Employee()
    {
        name = "";
        employeeNumber = "";
        hireDate = "";
    }

    // Setters
    public void setName(String n)
    {
        name = n;
    }

    public void setEmployeeNumber(String e)
    {
        if (validENum(e))
        {
            employeeNumber = e;
        }
        else
        {
            employeeNumber = "Invalid Format. Should be XXX-L where X is a digit between 0-9 and L is a letter between A-M.";
        }
    }

    public void setHireDate(String h)
    {
        hireDate = h;
    }

    // Getters
    public String getName()
    {
        return name;
    }

    public String getEmployeeNumber()
    {
        return employeeNumber;
    }

    public String getHireDate()
    {
        return hireDate;
    }

    private boolean validENum(String e)
    {
        boolean result = true;

        if (e.length() != 5)
            result = false;
        else
        {
            // Checking format
            if ((!Character.isDigit(e.charAt(0)))  ||
                    (!Character.isDigit(e.charAt(1)))   ||
                    (!Character.isDigit(e.charAt(2)))   ||
                    (e.charAt(3) != '-')                ||
                    (!Character.isLetter(e.charAt(4)))  ||

                    (!(e.charAt(4)>= 'A' && e.charAt(4)<= 'M')))
            {
                result = false;
            }
        }
        return result;
    }

    // toString method to print the data
    public String toString()
    {
        String str = "Name: " + name + "\nEmployee Number: ";

        if (employeeNumber == "")
        {
            str += "INVALID EMPLOYEE NUMBER";
        }
        else
        {
            str += employeeNumber;
        }

        str += ("\nHire Date: " + hireDate);
        return str;
    }
}


class ProductionWorker extends Employee
{
    public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;
     int shift;         // The employee's shift
     double payRate;    // The employee's pay rate


    // This constructor requires a name, employee number, hire date, shift, and pay rate


    public ProductionWorker(String n, String num, String date,
                            int sh, double rate)
    {
        super(n, num, date);
        shift = sh;
        payRate = rate;
    }

    // No-argument constructor
    public ProductionWorker(String n, String num, String date)
    {
        super();
        shift = DAY_SHIFT;
        payRate = 0.0;
    }

    // Setters
    public void setShift(int s)
    {
        shift = s;
    }

    public void setPayRate(double p)
    {
        payRate = p;
    }

    // Getters

    public int getShift()
    {
        return shift;
    }

    public double getPayRate()
    {
        return payRate;
    }

    // toString to print the data
    public String toString()
    {
        // Format for the dollar values
        DecimalFormat currency = new DecimalFormat("#,##0.00");

        // Printing parent class toString then the child toString
        String str = super.toString();

        str += "\nShift: ";
        if (shift == DAY_SHIFT)
            str += "Day";
        else if (shift == NIGHT_SHIFT)
            str += "Night";
        else
            str += "Invalid shift number. Must be 1 or 2.";

        str += ("\nHourly Pay Rate: $" +
                currency.format(payRate));

        return str;
    }
}


class TeamLeader extends ProductionWorker
{

    int minHours = 10; // Minimum amount of training hours required
    int hours = 0;
    double bonus = 0.0;



    public TeamLeader(String n, String num, String date, int sh, double rate, int h, double b) {
        super(n, num, date);
        shift = sh;
        payRate = rate;
        hours = h;
        bonus = b;
    }

    private boolean validHours(int hours)
    {
        if (hours >= minHours)
            return true;
        else
            return false;
    }


    // toString to print the data
    public String toString()
    {

        // Printing parent class toString then the child toString
        String str = super.toString();

        if (!validHours(hours))
            str += "\nTraining Hours: Not completed";
        else
            str += "\nTraining Hours: Completed";

        return str;
    }

}


class ShiftSupervisor extends Employee
{
    double annualSalary = 0.0;
    double annualBonus = 0.0;


    public ShiftSupervisor(String n, String num, String date, double salary, double bonus)
    {
        super(n, num, date);
        annualSalary = salary;
        annualBonus = bonus;
    }

    // Setters
    public void setSalary(double salary)
    {
        annualSalary = salary;
    }

    public void setBonus(double bonus)
    {
        annualBonus = bonus;
    }

// Getters
    public double getAnnualSalary()
    {
        return annualSalary;
    }


    public double getAnnualBonus()
    {
        return annualBonus;
    }

    // toString method to print the data
    public String toString()
    {
        String str = super.toString();

        str += "\nAnnual Salary: " + annualSalary +
                "\nAnnual Bonus " + annualBonus;

        return str;
    }
}

class ProductionWorkerDemo
{
    public static void main(String[] args)
    {
        String name;             // Employee name
        String employeeNumber;   // Employee number
        String hireDate;         // Employee hire date
        int shift;		  			 // Employee shift
        double payRate;  			 // Employee pay

        double salary = 0.0;   // Annual salary for shift supervisor
        double bonus = 0.0;   // Annual bonus for shift supervisor

        System.out.println("--- Question 1 ---");
        // Creates Scanner object
        Scanner s = new Scanner(System.in);

        // Gets the user's name.
        System.out.println("Enter employee name: ");
        name = s.nextLine();

        // Gets the user's employee number.
        System.out.println("Enter employee number: ");
        employeeNumber = s.nextLine();

        // Gets the user's hire date.
        System.out.println("Enter hire date: ");
        hireDate = s.nextLine();

        // Gets the user's payrate.
        System.out.println("Enter payrate: ");
        payRate = s.nextDouble();

        // Gets the user's shift.
        System.out.println("Enter shift number: ");
        shift = s.nextInt();

        // Creates an Production worker object.
        ProductionWorker pw =
                new ProductionWorker(name, employeeNumber, hireDate, shift, payRate);

        System.out.println("");

        // Printing data
        System.out.println(pw.toString());

        System.out.println("");


        System.out.println("--- Question 2 ---");

        System.out.println("Enter shift supervisor's name: ");
        name = s.nextLine();

        System.out.println("Enter shift supervisor's number: ");
        employeeNumber = s.nextLine();

        // Gets the user's hire date.
        System.out.println("Enter shift supervisor's hire date: ");
        hireDate = s.nextLine();

        System.out.println("Enter shift supervisor's annual salary: ");
        salary = s.nextDouble();

        System.out.println("Enter shift supervisor's annual bonus: ");
        bonus = s.nextDouble();

        System.out.println("");

        // Creating shift supervisor object
        ShiftSupervisor ss = new ShiftSupervisor(name, employeeNumber, hireDate, salary, bonus);

        ss.toString();

        System.out.println("--- Question 3 ---");


        // Gets the user's name.
        System.out.println("Enter employee name: ");
        name = s.nextLine();

        // Gets the user's employee number.
        System.out.println("Enter employee number: ");
        employeeNumber = s.nextLine();

        // Gets the user's hire date.
        System.out.println("Enter hire date: ");
        hireDate = s.nextLine();

        // Gets the user's payrate.
        System.out.println("Enter payrate: ");
        payRate = s.nextDouble();

        // Gets the user's shift.
        System.out.println("Enter shift number: ");
        shift = s.nextInt();

        System.out.println("Enter bonus: ");
        bonus = s.nextDouble();

        System.out.println("Training hours completed to date: ");
        int hours = s.nextInt();

        TeamLeader tl = new TeamLeader(name, employeeNumber, hireDate, shift, payRate, hours, bonus) ;

        tl.toString();
    }
}
